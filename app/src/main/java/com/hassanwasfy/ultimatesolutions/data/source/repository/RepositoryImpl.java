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
import com.hassanwasfy.ultimatesolutions.data.service.ApiService;
import com.hassanwasfy.ultimatesolutions.data.source.remote.RemoteDataSource;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryBills;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryName;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryStatuses;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryUpdate;
import com.hassanwasfy.ultimatesolutions.domain.state.State;

import javax.inject.Inject;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class RepositoryImpl implements Repository {


    private final RemoteDataSource remoteDataSource;

    @Inject
    public RepositoryImpl(RemoteDataSource remoteDataSource) {
        this.remoteDataSource = remoteDataSource;
    }


    @Override
    public Observable<DeliveryName> performDeliveryLoginCheck(
            String languageNumber,
            String deliveryNumber,
            String password
    ) {
        return remoteDataSource.performDeliveryLoginCheck(languageNumber, deliveryNumber, password);
    }

    @Override
    public Observable<DeliveryBills> performBillItemsRequest(String deliveryNumber, String languageNumber, String billSerial, String processFlag) {
        return remoteDataSource.performBillItemsRequest(deliveryNumber, languageNumber, billSerial, processFlag);
    }

    @Override
    public Observable<DeliveryStatuses> performBillTypesRequest(String languageNumber) {
        return remoteDataSource.performBillTypesRequest(languageNumber);
    }

    @Override
    public Observable<DeliveryUpdate> performUpdateDeliveryRequest(String languageNumber, String billSerial, String deliveryStatusFlag, String reason) {
        return remoteDataSource
                .performUpdateDeliveryRequest(languageNumber, billSerial, deliveryStatusFlag, reason);
    }
}
