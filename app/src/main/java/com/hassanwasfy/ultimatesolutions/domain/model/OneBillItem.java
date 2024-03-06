package com.hassanwasfy.ultimatesolutions.domain.model;

public class OneBillItem {
    private String billAmount;
    private String billDate;
    private String billNumber;
    private String billSerial;
    private String billTime;
    private String billType;
    private String customerAddress;
    private String customerApartmentNumber;
    private String customerBuildingNumber;
    private String customerFloorNumber;
    private String customerName;
    private String deliveryAmount;
    private String deliveryStatusFlag;
    private String latitude;
    private String longitude;
    private String mobileNumber;
    private String regionName;
    private String taxAmount;

    public OneBillItem(String billAmount, String billDate, String billNumber, String billSerial, String billTime, String billType, String customerAddress, String customerApartmentNumber, String customerBuildingNumber, String customerFloorNumber, String customerName, String deliveryAmount, String deliveryStatusFlag, String latitude, String longitude, String mobileNumber, String regionName, String taxAmount) {
        this.billAmount = billAmount;
        this.billDate = billDate;
        this.billNumber = billNumber;
        this.billSerial = billSerial;
        this.billTime = billTime;
        this.billType = billType;
        this.customerAddress = customerAddress;
        this.customerApartmentNumber = customerApartmentNumber;
        this.customerBuildingNumber = customerBuildingNumber;
        this.customerFloorNumber = customerFloorNumber;
        this.customerName = customerName;
        this.deliveryAmount = deliveryAmount;
        this.deliveryStatusFlag = deliveryStatusFlag;
        this.latitude = latitude;
        this.longitude = longitude;
        this.mobileNumber = mobileNumber;
        this.regionName = regionName;
        this.taxAmount = taxAmount;
    }

    public String getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(String billAmount) {
        this.billAmount = billAmount;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getBillSerial() {
        return billSerial;
    }

    public void setBillSerial(String billSerial) {
        this.billSerial = billSerial;
    }

    public String getBillTime() {
        return billTime;
    }

    public void setBillTime(String billTime) {
        this.billTime = billTime;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerApartmentNumber() {
        return customerApartmentNumber;
    }

    public void setCustomerApartmentNumber(String customerApartmentNumber) {
        this.customerApartmentNumber = customerApartmentNumber;
    }

    public String getCustomerBuildingNumber() {
        return customerBuildingNumber;
    }

    public void setCustomerBuildingNumber(String customerBuildingNumber) {
        this.customerBuildingNumber = customerBuildingNumber;
    }

    public String getCustomerFloorNumber() {
        return customerFloorNumber;
    }

    public void setCustomerFloorNumber(String customerFloorNumber) {
        this.customerFloorNumber = customerFloorNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDeliveryAmount() {
        return deliveryAmount;
    }

    public void setDeliveryAmount(String deliveryAmount) {
        this.deliveryAmount = deliveryAmount;
    }

    public String getDeliveryStatusFlag() {
        return deliveryStatusFlag;
    }

    public void setDeliveryStatusFlag(String deliveryStatusFlag) {
        this.deliveryStatusFlag = deliveryStatusFlag;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }
}
