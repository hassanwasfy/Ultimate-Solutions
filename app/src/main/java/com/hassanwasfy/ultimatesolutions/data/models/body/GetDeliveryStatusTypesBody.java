package com.hassanwasfy.ultimatesolutions.data.models.body;

import com.google.gson.annotations.SerializedName;

public class GetDeliveryStatusTypesBody {
    @SerializedName("P_LANG_NO")
    private String languageNumber;

    public GetDeliveryStatusTypesBody(String languageNumber) {
        this.languageNumber = languageNumber;
    }

    public String getLanguageNumber() {
        return languageNumber;
    }

    public void setLanguageNumber(String languageNumber) {
        this.languageNumber = languageNumber;
    }
}
