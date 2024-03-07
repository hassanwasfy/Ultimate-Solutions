package com.hassanwasfy.ultimatesolutions.presentation.screen.home;

import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryBills;
import com.hassanwasfy.ultimatesolutions.domain.model.OneBillItem;

import java.util.ArrayList;

public class HomeDataHolder {
    private Boolean isLoading;
    private Boolean isError;
    private String errorMessage;
    private String userName;
    private ArrayList<OneBillItem> deliveryBills;

    public HomeDataHolder() {
        this.isLoading = true;
        this.isError = false;
        this.errorMessage = "";
        this.userName = "";
        this.deliveryBills = new ArrayList<>();
    }

    public HomeDataHolder(
            String userName,
            ArrayList<OneBillItem> deliveryBills
    ) {
        this.userName = userName;
        this.deliveryBills = deliveryBills;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<OneBillItem> getDeliveryBills() {
        return deliveryBills;
    }

    public void setDeliveryBills(ArrayList<OneBillItem> deliveryBills) {
        this.deliveryBills = deliveryBills;
    }

    public Boolean getLoading() {
        return isLoading;
    }

    public void setLoading(Boolean loading) {
        isLoading = loading;
    }

    public Boolean getError() {
        return isError;
    }

    public void setError(Boolean error) {
        isError = error;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
