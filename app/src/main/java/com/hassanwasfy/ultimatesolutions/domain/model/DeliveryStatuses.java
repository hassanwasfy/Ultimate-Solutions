package com.hassanwasfy.ultimatesolutions.domain.model;

import java.util.ArrayList;

public class DeliveryStatuses {
    private ArrayList<OneStatusItem> deliveryStatusesList;;

    public DeliveryStatuses(ArrayList<OneStatusItem> deliveryStatusesList) {
        this.deliveryStatusesList = deliveryStatusesList;
    }

    public ArrayList<OneStatusItem> getDeliveryStatusesList() {
        return deliveryStatusesList;
    }

    public void setDeliveryStatusesList(ArrayList<OneStatusItem> deliveryStatusesList) {
        this.deliveryStatusesList = deliveryStatusesList;
    }
}
