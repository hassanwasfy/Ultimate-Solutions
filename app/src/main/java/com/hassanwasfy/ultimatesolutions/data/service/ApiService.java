package com.hassanwasfy.ultimatesolutions.data.service;

import com.hassanwasfy.ultimatesolutions.data.models.body.BaseRequestBody;
import com.hassanwasfy.ultimatesolutions.data.models.body.CheckDeliveryLoginBody;
import com.hassanwasfy.ultimatesolutions.data.models.body.GetDeliveryBillsItemsBody;
import com.hassanwasfy.ultimatesolutions.data.models.body.GetDeliveryStatusTypesBody;
import com.hassanwasfy.ultimatesolutions.data.models.dto.BaseResponse;
import com.hassanwasfy.ultimatesolutions.data.models.dto.DeliveryBillsResponse;
import com.hassanwasfy.ultimatesolutions.data.models.dto.DeliveryNameResponse;
import com.hassanwasfy.ultimatesolutions.data.models.dto.DeliveryStatusTypesResponse;
import io.reactivex.rxjava3.core.Single;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    @POST("CheckDeliveryLogin")
    Single<BaseResponse<DeliveryNameResponse>> performDeliveryLoginCheck(
            @Body BaseRequestBody<CheckDeliveryLoginBody> checkDeliveryLoginBody
    );

    @POST("GetDeliveryBillsItems")
    Single<BaseResponse<DeliveryBillsResponse>> performBillItemsRequest(
            @Body BaseRequestBody<GetDeliveryBillsItemsBody> getDeliveryBillsItemsBody
    );

    @POST("GetDeliveryStatusTypes")
    Single<BaseResponse<DeliveryStatusTypesResponse>> performBillTypesRequest(
            @Body BaseRequestBody<GetDeliveryStatusTypesBody> getDeliveryStatusTypesBody
    );

    @POST("UpdateDeliveryBillStatus")
    Single<BaseResponse<DeliveryStatusTypesResponse>> performUpdateDeliveryRequest(
            @Body BaseRequestBody<GetDeliveryStatusTypesBody> getDeliveryStatusTypesBody
    );


}
