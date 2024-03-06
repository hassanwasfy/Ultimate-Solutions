package com.hassanwasfy.ultimatesolutions.data.models.mappers;

import com.hassanwasfy.ultimatesolutions.data.models.dto.UpdateDeliveryBillStatusResponse;
import com.hassanwasfy.ultimatesolutions.domain.mapper.IClassConvertor;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryUpdate;

public class DeliverUpdateConvertor implements IClassConvertor<UpdateDeliveryBillStatusResponse, DeliveryUpdate> {
    @Override
    public DeliveryUpdate convertToDomainModel(UpdateDeliveryBillStatusResponse fromType) {
        return new DeliveryUpdate(fromType.getResult().getResponseMessage());
    }
}
