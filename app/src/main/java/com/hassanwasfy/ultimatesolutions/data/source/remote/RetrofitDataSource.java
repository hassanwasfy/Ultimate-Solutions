package com.hassanwasfy.ultimatesolutions.data.source.remote;

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
import com.hassanwasfy.ultimatesolutions.data.service.ApiService;
import javax.inject.Inject;
import io.reactivex.rxjava3.core.Single;
import retrofit2.Response;

public class RetrofitDataSource implements RemoteDataSource {

    private final ApiService apiService;

    @Inject
    public RetrofitDataSource(ApiService apiService) {
        this.apiService = apiService;
    }


}
