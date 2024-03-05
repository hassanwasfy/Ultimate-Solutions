package com.hassanwasfy.ultimatesolutions.data.models.body;

import com.google.gson.annotations.SerializedName;

public class CheckDeliveryLoginBody {
    @SerializedName("P_LANG_NO")
    private String langNumber;

    @SerializedName("P_DLVRY_NO")
    private String deliveryNumber;
    @SerializedName("P_PSSWRD")
    private String password;

    public CheckDeliveryLoginBody(String langNumber, String deliveryNumber, String password) {
        this.langNumber = langNumber;
        this.deliveryNumber = deliveryNumber;
        this.password = password;
    }


    public String getLangNumber() {
        return langNumber;
    }

    public void setLangNumber(String langNumber) {
        this.langNumber = langNumber;
    }

    public String getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(String deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
