package com.hassanwasfy.ultimatesolutions.data.source.remote;

import com.hassanwasfy.ultimatesolutions.data.models.dto.DeliveryBillsResponse;
import com.hassanwasfy.ultimatesolutions.data.models.dto.DeliveryNameResponse;
import com.hassanwasfy.ultimatesolutions.data.models.dto.DeliveryStatusTypesResponse;
import com.hassanwasfy.ultimatesolutions.data.models.dto.UpdateDeliveryBillStatusResponse;

public interface RemoteDataSource {
    DeliveryNameResponse performDeliveryLoginCheck(
            String languageNumber, String deliveryNumber, String password
    );

    DeliveryBillsResponse performBillItemsRequest(
            String deliveryNumber,String languageNumber, String billSerial, String processFlag
    );

  DeliveryStatusTypesResponse performBillTypesRequest(
          String languageNumber
  );

    UpdateDeliveryBillStatusResponse performUpdateDeliveryRequest(
            String languageNumber, String billSerial, String deliveryStatusFlag, String reason
    );
}
