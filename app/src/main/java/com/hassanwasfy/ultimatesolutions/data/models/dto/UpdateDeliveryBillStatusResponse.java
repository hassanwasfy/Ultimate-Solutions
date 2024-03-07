package com.hassanwasfy.ultimatesolutions.data.models.dto;

import com.google.gson.annotations.SerializedName;

public class UpdateDeliveryBillStatusResponse {
    @SerializedName("Result")
    private ResponseResult result;

    public UpdateDeliveryBillStatusResponse(ResponseResult result) {
        this.result = result;
    }

    public ResponseResult getResult() {
        return result;
    }

    public void setResult(ResponseResult result) {
        this.result = result;
    }
}
