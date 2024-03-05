package com.hassanwasfy.ultimatesolutions.data.models.dto;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DeliveryStatusTypesResponse {

    @SerializedName("DeliveryStatusTypes")
    private List<ResponseResult> statusTypesList;

    public DeliveryStatusTypesResponse(List<ResponseResult> statusTypesList) {
        this.statusTypesList = statusTypesList;
    }

    public List<ResponseResult> getTypesList() {
        return statusTypesList;
    }

    public void setTypesList(List<ResponseResult> statusTypesList) {
        this.statusTypesList = statusTypesList;
    }
}
