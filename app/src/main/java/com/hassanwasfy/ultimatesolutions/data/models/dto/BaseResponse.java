package com.hassanwasfy.ultimatesolutions.data.models.dto;

import com.google.gson.annotations.SerializedName;

public class BaseResponse<ResponseType> {

    @SerializedName("Data")
    private ResponseType responseDate;

    @SerializedName("Result")
    private ResponseResult responseResult;

    public BaseResponse() {
    }

    public BaseResponse(ResponseType responseDate, ResponseResult responseResult) {
        this.responseDate = responseDate;
        this.responseResult = responseResult;
    }

    public ResponseType getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(ResponseType responseDate) {
        this.responseDate = responseDate;
    }

    public ResponseResult getResponseResult() {
        return responseResult;
    }

    public void setResponseResult(ResponseResult responseResult) {
        this.responseResult = responseResult;
    }
}
