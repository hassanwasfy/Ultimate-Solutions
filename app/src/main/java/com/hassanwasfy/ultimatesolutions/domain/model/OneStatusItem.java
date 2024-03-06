package com.hassanwasfy.ultimatesolutions.domain.model;


public class OneStatusItem {
    private String typeName;
    private String typeNumber;

    public OneStatusItem(String typeName, String typeNumber) {
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
