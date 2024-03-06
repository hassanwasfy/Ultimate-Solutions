package com.hassanwasfy.ultimatesolutions.data.source.remote;

import com.hassanwasfy.ultimatesolutions.data.models.dto.BaseResponse;
import com.hassanwasfy.ultimatesolutions.data.models.dto.DeliveryBillsResponse;
import com.hassanwasfy.ultimatesolutions.data.models.dto.DeliveryStatusTypesResponse;
import com.hassanwasfy.ultimatesolutions.data.models.dto.UpdateDeliveryBillStatusResponse;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryBills;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryName;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryStatuses;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryUpdate;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.Response;

public interface RemoteDataSource {
    Observable<DeliveryName> performDeliveryLoginCheck(
            String languageNumber, String deliveryNumber, String password
    );

    Observable<DeliveryBills> performBillItemsRequest(
            String deliveryNumber, String languageNumber, String billSerial, String processFlag
    );

    Observable<DeliveryStatuses> performBillTypesRequest(
            String languageNumber
    );

    Observable<DeliveryUpdate> performUpdateDeliveryRequest(
            String languageNumber, String billSerial, String deliveryStatusFlag, String reason
    );
}
