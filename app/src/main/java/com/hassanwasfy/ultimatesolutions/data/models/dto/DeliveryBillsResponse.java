package com.hassanwasfy.ultimatesolutions.data.models.dto;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DeliveryBillsResponse {
    @SerializedName("DeliveryBills")
    private ArrayList<BillItemResponse> deliveryBills;

    public DeliveryBillsResponse(ArrayList<BillItemResponse> deliveryBills) {
        this.deliveryBills = deliveryBills;
    }

    public ArrayList<BillItemResponse> getDeliveryBills() {
        return deliveryBills;
    }

    public void setDeliveryBills(ArrayList<BillItemResponse> deliveryBills) {
        this.deliveryBills = deliveryBills;
    }
}
