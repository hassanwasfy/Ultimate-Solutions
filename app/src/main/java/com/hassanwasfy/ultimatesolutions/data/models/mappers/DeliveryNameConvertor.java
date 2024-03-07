package com.hassanwasfy.ultimatesolutions.data.models.mappers;


import com.hassanwasfy.ultimatesolutions.data.models.dto.DeliveryNameResponse;
import com.hassanwasfy.ultimatesolutions.domain.mapper.IClassConvertor;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryName;

public class DeliveryNameConvertor implements IClassConvertor<DeliveryNameResponse, DeliveryName> {
    @Override
    public DeliveryName convertToDomainModel(DeliveryNameResponse fromType) {
        return new DeliveryName(fromType.getDeliveryName());
    }
}
