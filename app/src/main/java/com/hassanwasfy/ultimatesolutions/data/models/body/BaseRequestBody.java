package com.hassanwasfy.ultimatesolutions.data.models.body;

import com.google.gson.annotations.SerializedName;

public class BaseRequestBody<RequiredBody> {
    @SerializedName("Value")
    private RequiredBody loginValue;

    public RequiredBody getValue() {
        return loginValue;
    }

    public void setValue(RequiredBody loginValue) {
        this.loginValue = loginValue;
    }
}


