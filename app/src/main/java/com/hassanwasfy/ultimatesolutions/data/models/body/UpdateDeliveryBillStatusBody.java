package com.hassanwasfy.ultimatesolutions.data.models.body;

import com.google.gson.annotations.SerializedName;

public class UpdateDeliveryBillStatusBody {

    @SerializedName("P_LANG_NO")
    private String languageNumber;
    @SerializedName("P_BILL_SRL")
    private String billSerialNumber;
    @SerializedName("P_DLVRY_STATUS_FLG")
    private String deliveryStatusFlag;
    @SerializedName("P_DLVRY_RTRN_RSN")
    private String deliveryReturnReason;

    public UpdateDeliveryBillStatusBody(
            String languageNumber,
            String billSerialNumber,
            String deliveryStatusFlag,
            String deliveryReturnReason
    ) {
        this.languageNumber = languageNumber;
        this.billSerialNumber = billSerialNumber;
        this.deliveryStatusFlag = deliveryStatusFlag;
        this.deliveryReturnReason = deliveryReturnReason;
    }

    public String getLanguageNumber() {
        return languageNumber;
    }

    public void setLanguageNumber(String languageNumber) {
        this.languageNumber = languageNumber;
    }

    public String getBillSerialNumber() {
        return billSerialNumber;
    }

    public void setBillSerialNumber(String billSerialNumber) {
        this.billSerialNumber = billSerialNumber;
    }

    public String getDeliveryStatusFlag() {
        return deliveryStatusFlag;
    }

    public void setDeliveryStatusFlag(String deliveryStatusFlag) {
        this.deliveryStatusFlag = deliveryStatusFlag;
    }

    public String getDeliveryReturnReason() {
        return deliveryReturnReason;
    }

    public void setDeliveryReturnReason(String deliveryReturnReason) {
        this.deliveryReturnReason = deliveryReturnReason;
    }
}
