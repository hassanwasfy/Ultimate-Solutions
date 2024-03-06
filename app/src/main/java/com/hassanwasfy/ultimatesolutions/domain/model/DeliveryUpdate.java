package com.hassanwasfy.ultimatesolutions.domain.model;

public class DeliveryUpdate {
    private String updateMessage;

    public DeliveryUpdate(String updateMessage) {
        this.updateMessage = updateMessage;
    }

    public String getUpdateMessage() {
        return updateMessage;
    }

    public void setUpdateMessage(String updateMessage) {
        this.updateMessage = updateMessage;
    }
}
