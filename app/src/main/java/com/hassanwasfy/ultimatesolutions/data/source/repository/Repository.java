package com.hassanwasfy.ultimatesolutions.data.source.repository;

import com.hassanwasfy.ultimatesolutions.data.models.body.BaseRequestBody;
import com.hassanwasfy.ultimatesolutions.data.models.body.CheckDeliveryLoginBody;
import com.hassanwasfy.ultimatesolutions.data.models.body.GetDeliveryBillsItemsBody;
import com.hassanwasfy.ultimatesolutions.data.models.body.GetDeliveryStatusTypesBody;
import com.hassanwasfy.ultimatesolutions.data.models.body.UpdateDeliveryBillStatusBody;
import com.hassanwasfy.ultimatesolutions.data.models.dto.BaseResponse;
import com.hassanwasfy.ultimatesolutions.data.models.dto.DeliveryBillsResponse;
import com.hassanwasfy.ultimatesolutions.data.models.dto.DeliveryNameResponse;
import com.hassanwasfy.ultimatesolutions.data.models.dto.DeliveryStatusTypesResponse;
import com.hassanwasfy.ultimatesolutions.data.models.dto.UpdateDeliveryBillStatusResponse;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryBills;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryName;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryStatuses;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryUpdate;
import com.hassanwasfy.ultimatesolutions.domain.state.State;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;


public interface Repository {
    Observable<DeliveryName> performDeliveryLoginCheck(
            String languageNumber, String deliveryNumber, String password
    );


    Observable<DeliveryBills> performBillItemsRequest(
            String deliveryNumber,String languageNumber, String billSerial, String processFlag
    );


    Observable<DeliveryStatuses> performBillTypesRequest(
            String languageNumber
    );

    Observable<DeliveryUpdate> performUpdateDeliveryRequest(
            String languageNumber, String billSerial, String deliveryStatusFlag, String reason
    );
}
