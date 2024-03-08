package com.hassanwasfy.ultimatesolutions.data.source.repository;

import com.hassanwasfy.ultimatesolutions.data.source.local.LoginSharedPrefs;
import com.hassanwasfy.ultimatesolutions.data.source.remote.RemoteDataSource;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryBills;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryName;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryStatuses;
import com.hassanwasfy.ultimatesolutions.domain.model.DeliveryUpdate;
import javax.inject.Inject;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class RepositoryImpl implements Repository {


    private final RemoteDataSource remoteDataSource;
    private final LoginSharedPrefs loginSharedPrefs;
    @Inject
    public RepositoryImpl(
            RemoteDataSource remoteDataSource,
            LoginSharedPrefs loginSharedPrefs
    ) {
        this.remoteDataSource = remoteDataSource;
        this.loginSharedPrefs = loginSharedPrefs;
    }
    
    @Inject



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

    @Override
    public Single<Boolean> getLoginStatus() {
        return Single.just(loginSharedPrefs.isLoggedIn());
    }

    @Override
    public void setLoginStatus(Boolean value) {
        loginSharedPrefs.setLoggedIn(value);
    }
}
