package com.hassanwasfy.ultimatesolutions.data.models.mappers;

import com.hassanwasfy.ultimatesolutions.data.models.dto.BillItemResponse;
import com.hassanwasfy.ultimatesolutions.data.models.dto.DeliveryBillsResponse;
import com.hassanwasfy.ultimatesolutions.domain.mapper.IClassConvertor;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryBills;
import com.hassanwasfy.ultimatesolutions.domain.model.OneBillItem;

import java.util.ArrayList;

public class DeliveryBillsConvertor implements IClassConvertor<DeliveryBillsResponse, DeliveryBills> {
    @Override
    public DeliveryBills convertToDomainModel(DeliveryBillsResponse fromType) {

        ArrayList<OneBillItem> newDomainList = new ArrayList<>(fromType.getDeliveryBills().size());

        for (BillItemResponse billItemResponse : fromType.getDeliveryBills()) {
            newDomainList.add(new OneBillItem(
                    billItemResponse.getBillAmount(),
                    billItemResponse.getBillDate(),
                    billItemResponse.getBillNumber(),
                    billItemResponse.getBillSerial(),
                    billItemResponse.getBillTime(),
                    billItemResponse.getBillType(),
                    billItemResponse.getCustomerAddress(),
                    billItemResponse.getCustomerApartmentNumber(),
                    billItemResponse.getCustomerBuildingNumber(),
                    billItemResponse.getCustomerFloorNumber(),
                    billItemResponse.getCustomerName(),
                    billItemResponse.getDeliveryAmount(),
                    billItemResponse.getDeliveryStatusFlag(),
                    billItemResponse.getLatitude(),
                    billItemResponse.getLongitude(),
                    billItemResponse.getMobileNumber(),
                    billItemResponse.getRegionName(),
                    billItemResponse.getTaxAmount()
            ));
        }
        return new DeliveryBills(newDomainList);
    }
}