package com.hassanwasfy.ultimatesolutions.data.service;

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
import io.reactivex.rxjava3.core.Observable;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    @POST("CheckDeliveryLogin")
    Observable<Response<BaseResponse<DeliveryNameResponse>>> performDeliveryLoginCheck(
            @Body BaseRequestBody<CheckDeliveryLoginBody> checkDeliveryLoginBody
    );

    @POST("GetDeliveryBillsItems")
    Observable<Response<BaseResponse<DeliveryBillsResponse>>> performBillItemsRequest(
            @Body BaseRequestBody<GetDeliveryBillsItemsBody> getDeliveryBillsItemsBody
    );

    @POST("GetDeliveryStatusTypes")
    Observable<Response<BaseResponse<DeliveryStatusTypesResponse>>> performBillTypesRequest(
            @Body BaseRequestBody<GetDeliveryStatusTypesBody> getDeliveryStatusTypesBody
    );

    @POST("UpdateDeliveryBillStatus")
    Observable<Response<BaseResponse<UpdateDeliveryBillStatusResponse>>> performUpdateDeliveryRequest(
            @Body BaseRequestBody<UpdateDeliveryBillStatusBody> getDeliveryStatusTypesBody
    );


}
