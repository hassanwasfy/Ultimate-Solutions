package com.hassanwasfy.ultimatesolutions.data.models.body;

import com.google.gson.annotations.SerializedName;

public class GetDeliveryBillsItemsBody {
    @SerializedName("P_DLVRY_NO")
    private String langNumber;

    @SerializedName("P_LANG_NO")
    private String languageNumber;
    @SerializedName("P_BILL_SRL")
    private String billSerialNumber;

    @SerializedName("P_PRCSSD_FLG")
    private String processedFlag;

    public GetDeliveryBillsItemsBody(
            String langNumber,
            String languageNumber,
            String billSerialNumber,
            String processedFlag
    ) {
        this.langNumber = langNumber;
        this.languageNumber = languageNumber;
        this.billSerialNumber = billSerialNumber;
        this.processedFlag = processedFlag;
    }

    public String getLangNumber() {
        return langNumber;
    }

    public void setLangNumber(String langNumber) {
        this.langNumber = langNumber;
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

    public String getProcessedFlag() {
        return processedFlag;
    }

    public void setProcessedFlag(String processedFlag) {
        this.processedFlag = processedFlag;
    }
}
