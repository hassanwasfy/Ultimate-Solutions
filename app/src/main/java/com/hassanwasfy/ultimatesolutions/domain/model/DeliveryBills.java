package com.hassanwasfy.ultimatesolutions.domain.model;

import java.util.ArrayList;

public class DeliveryBills {
    private ArrayList<OneBillItem> deliveryBills;
    public DeliveryBills(ArrayList<OneBillItem> deliveryBills) {
        this.deliveryBills = deliveryBills;
    }
    public ArrayList<OneBillItem> getDeliveryBills() {
        return deliveryBills;
    }

    public void setDeliveryBills(ArrayList<OneBillItem> deliveryBills) {
        this.deliveryBills = deliveryBills;
    }
}