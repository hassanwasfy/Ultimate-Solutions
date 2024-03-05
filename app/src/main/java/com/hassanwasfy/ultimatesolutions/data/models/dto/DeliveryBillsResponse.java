package com.hassanwasfy.ultimatesolutions.data.models.dto;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DeliveryBillsResponse {
    @SerializedName("DeliveryBills")
    private List<BillItemResponse> deliveryBills;

    public DeliveryBillsResponse(List<BillItemResponse> deliveryBills) {
        this.deliveryBills = deliveryBills;
    }

    public List<BillItemResponse> getDeliveryBills() {
        return deliveryBills;
    }

    public void setDeliveryBills(List<BillItemResponse> deliveryBills) {
        this.deliveryBills = deliveryBills;
    }
}
