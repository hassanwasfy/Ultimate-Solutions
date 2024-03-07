package com.hassanwasfy.ultimatesolutions.presentation.screen.home;

import android.annotation.SuppressLint;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.hassanwasfy.ultimatesolutions.data.source.repository.Repository;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.schedulers.Schedulers;

@HiltViewModel
public class HomeViewModel extends ViewModel {

    private final MutableLiveData<HomeDataHolder> stateLiveData = new MutableLiveData<>();

    public LiveData<HomeDataHolder> getStateLiveData() {
        return stateLiveData;
    }
    private Repository repository;

    @SuppressLint("CheckResult")
    @Inject
    public HomeViewModel(Repository repository) {
        this.repository = repository;
        initialize();
    }

    @SuppressLint("CheckResult")
    private void initialize() {
        stateLiveData.setValue(new HomeDataHolder());
        repository.performBillItemsRequest("1010","1","","")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        data -> {
                            HomeDataHolder newValue = stateLiveData.getValue();
                            assert newValue != null;
                            newValue.setDeliveryBills(data.getDeliveryBills());
                            stateLiveData.setValue(newValue);
                        },
                        error -> {
                            HomeDataHolder newValue = stateLiveData.getValue();
                            assert newValue != null;
                            newValue.setError(true);
                            newValue.setErrorMessage(error.getMessage());
                            stateLiveData.setValue(newValue);
                        }
                );
    }
}
