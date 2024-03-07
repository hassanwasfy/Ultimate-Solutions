package com.hassanwasfy.ultimatesolutions.data.source.remote;

import com.hassanwasfy.ultimatesolutions.data.models.body.BaseRequestBody;
import com.hassanwasfy.ultimatesolutions.data.models.body.CheckDeliveryLoginBody;
import com.hassanwasfy.ultimatesolutions.data.models.body.GetDeliveryBillsItemsBody;
import com.hassanwasfy.ultimatesolutions.data.models.body.GetDeliveryStatusTypesBody;
import com.hassanwasfy.ultimatesolutions.data.models.body.UpdateDeliveryBillStatusBody;
import com.hassanwasfy.ultimatesolutions.data.models.mappers.DeliverUpdateConvertor;
import com.hassanwasfy.ultimatesolutions.data.models.mappers.DeliveryBillsConvertor;
import com.hassanwasfy.ultimatesolutions.data.models.mappers.DeliveryNameConvertor;
import com.hassanwasfy.ultimatesolutions.data.models.mappers.DeliveryStatusConvertor;
import com.hassanwasfy.ultimatesolutions.data.service.ApiService;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryBills;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryName;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryStatuses;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryUpdate;
import com.hassanwasfy.ultimatesolutions.domain.utils.UsException;

import javax.inject.Inject;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class RetrofitDataSource implements RemoteDataSource {

    private final ApiService apiService;

    @Inject
    public RetrofitDataSource(ApiService apiService) {
        this.apiService = apiService;
    }

    @Override
    public Observable<DeliveryName> performDeliveryLoginCheck(String languageNumber, String deliveryNumber, String password) {
        CheckDeliveryLoginBody body = new CheckDeliveryLoginBody(
                languageNumber,
                deliveryNumber,
                password
        );
        BaseRequestBody<CheckDeliveryLoginBody> baseBody = new BaseRequestBody<>();
        baseBody.setValue(body);

        return apiService.performDeliveryLoginCheck(baseBody)
                .map(response -> {
                    if (response.isSuccessful() && response.body() != null) {
                        if (response.body().getResponseResult().getResponseCode() == 0) {
                            DeliveryNameConvertor factory = new DeliveryNameConvertor();
                            return factory.convertToDomainModel(response.body().getResponseDate());
                        } else {
                            throw new UsException.NoDataException("no data found");
                        }
                    } else {
                        throw new UsException.RequestFailedException("request failed");
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }


    @Override
    public Observable<DeliveryBills> performBillItemsRequest(
            String deliveryNumber,
            String languageNumber,
            String billSerial,
            String processFlag
    ) {
        GetDeliveryBillsItemsBody body = new GetDeliveryBillsItemsBody(
                deliveryNumber, languageNumber, billSerial, processFlag
        );
        BaseRequestBody<GetDeliveryBillsItemsBody> baseBody = new BaseRequestBody<>();
        baseBody.setValue(body);

        return apiService.performBillItemsRequest(baseBody)
                .map(response -> {
                    if (response.isSuccessful() && response.body() != null) {
                        if (response.body().getResponseResult().getResponseCode() == 0) {
                            DeliveryBillsConvertor factory = new DeliveryBillsConvertor();
                            return factory.convertToDomainModel(response.body().getResponseDate());
                        } else {
                            throw new UsException.NoDataException("no data found");
                        }
                    } else {
                        throw new UsException.RequestFailedException("request failed");
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    @Override
    public Observable<DeliveryStatuses> performBillTypesRequest(String languageNumber) {
        GetDeliveryStatusTypesBody body = new GetDeliveryStatusTypesBody(
                languageNumber
        );
        BaseRequestBody<GetDeliveryStatusTypesBody> baseBody = new BaseRequestBody<>();
        baseBody.setValue(body);

        return apiService.performBillTypesRequest(baseBody)
                .map(response -> {
                    if (response.isSuccessful() && response.body() != null) {
                        if (response.body().getResponseResult().getResponseCode() == 0) {
                            DeliveryStatusConvertor factory = new DeliveryStatusConvertor();
                            return factory.convertToDomainModel(response.body().getResponseDate());
                        } else {
                            throw new UsException.NoDataException("no data found");
                        }
                    } else {
                        throw new UsException.RequestFailedException("request failed");
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    @Override
    public Observable<DeliveryUpdate> performUpdateDeliveryRequest(String languageNumber, String billSerial, String deliveryStatusFlag, String reason) {
        UpdateDeliveryBillStatusBody body = new UpdateDeliveryBillStatusBody(
                languageNumber, billSerial, deliveryStatusFlag, reason
        );
        BaseRequestBody<UpdateDeliveryBillStatusBody> baseBody = new BaseRequestBody<>();
        baseBody.setValue(body);

        return apiService.performUpdateDeliveryRequest(baseBody)
                .map(response -> {
                    if (response.isSuccessful() && response.body() != null) {
                        if (response.body().getResponseResult().getResponseCode() == 0) {
                            DeliverUpdateConvertor factory = new DeliverUpdateConvertor();
                            return factory.convertToDomainModel(response.body().getResponseDate());
                        } else {
                            throw new UsException.NoDataException("no data found");
                        }
                    } else {
                        throw new UsException.RequestFailedException("request failed");
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}