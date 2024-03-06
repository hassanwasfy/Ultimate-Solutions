package com.hassanwasfy.ultimatesolutions.data.models.mappers;

import com.hassanwasfy.ultimatesolutions.data.models.dto.DeliveryStatusTypesResponse;
import com.hassanwasfy.ultimatesolutions.data.models.dto.StatusItemResponse;
import com.hassanwasfy.ultimatesolutions.domain.mapper.IClassConvertor;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryStatuses;
import com.hassanwasfy.ultimatesolutions.domain.model.OneStatusItem;

import java.util.ArrayList;

public class DeliveryStatusConvertor implements IClassConvertor<DeliveryStatusTypesResponse, DeliveryStatuses> {
    @Override
    public DeliveryStatuses convertToDomainModel(DeliveryStatusTypesResponse fromType) {
        ArrayList<OneStatusItem> newDomainList = new ArrayList<>(fromType.getTypesList().size());
        for (StatusItemResponse type : fromType.getTypesList()) {
            newDomainList.add(new OneStatusItem(type.getTypeName(), type.getTypeNumber()));
        }
        return new DeliveryStatuses(newDomainList);
    }
}
