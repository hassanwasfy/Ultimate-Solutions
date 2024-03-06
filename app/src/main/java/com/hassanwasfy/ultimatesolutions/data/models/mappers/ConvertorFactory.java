package com.hassanwasfy.ultimatesolutions.data.models.mappers;

import com.hassanwasfy.ultimatesolutions.data.models.dto.DeliveryBillsResponse;
import com.hassanwasfy.ultimatesolutions.data.models.dto.DeliveryNameResponse;
import com.hassanwasfy.ultimatesolutions.data.models.dto.DeliveryStatusTypesResponse;
import com.hassanwasfy.ultimatesolutions.data.models.dto.UpdateDeliveryBillStatusResponse;
import com.hassanwasfy.ultimatesolutions.domain.mapper.IClassConvertor;
import java.util.UnknownFormatConversionException;

public class ConvertorFactory<T> {
    public IClassConvertor convert(T targetObject) throws UnknownFormatConversionException {
        if (targetObject instanceof UpdateDeliveryBillStatusResponse) {
            return new DeliverUpdateConvertor();
        } else if (targetObject instanceof DeliveryBillsResponse) {
            return new DeliveryBillsConvertor();
        } else if (targetObject instanceof DeliveryNameResponse) {
            return new DeliveryNameConvertor();
        } else if (targetObject instanceof DeliveryStatusTypesResponse) {
            return new DeliveryStatusConvertor();
        }
        throw new UnknownFormatConversionException("Not found Convertor");
    }
}
