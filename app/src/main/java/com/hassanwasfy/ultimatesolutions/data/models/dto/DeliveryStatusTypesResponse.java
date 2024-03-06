package com.hassanwasfy.ultimatesolutions.data.models.dto;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DeliveryStatusTypesResponse {

    @SerializedName("DeliveryStatusTypes")
    private ArrayList<StatusItemResponse> statusTypesList;

    public DeliveryStatusTypesResponse(ArrayList<StatusItemResponse> statusTypesList) {
        this.statusTypesList = statusTypesList;
    }

    public ArrayList<StatusItemResponse> getTypesList() {
        return statusTypesList;
    }

    public void setTypesList(ArrayList<StatusItemResponse> statusTypesList) {
        this.statusTypesList = statusTypesList;
    }
}
