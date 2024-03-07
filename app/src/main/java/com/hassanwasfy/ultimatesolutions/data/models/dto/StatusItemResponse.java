package com.hassanwasfy.ultimatesolutions.data.models.dto;

import com.google.gson.annotations.SerializedName;

public class StatusItemResponse {

    @SerializedName("TYP_NM")
    private String typeName;

    @SerializedName("TYP_NO")
    private String typeNumber;


    public StatusItemResponse(String typeName, String typeNumber) {
        this.typeName = typeName;
        this.typeNumber = typeNumber;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(String typeNumber) {
        this.typeNumber = typeNumber;
    }
}