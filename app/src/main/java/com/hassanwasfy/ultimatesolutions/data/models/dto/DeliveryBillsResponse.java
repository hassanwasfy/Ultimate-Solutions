package com.hassanwasfy.ultimatesolutions.data.models.dto;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class DeliveryBillsResponse {

    @SerializedName("DeliveryBills")
    private List<BillItemResponse> deliveryBills;
}
