package com.hassanwasfy.ultimatesolutions.data.models.dto;

import com.google.gson.annotations.SerializedName;

public class DeliveryNameResponse {
    @SerializedName("DeliveryName")
    private String deliveryName;

    public DeliveryNameResponse(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }
}
