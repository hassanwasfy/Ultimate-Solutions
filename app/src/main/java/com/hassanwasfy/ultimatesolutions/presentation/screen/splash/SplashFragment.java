package com.hassanwasfy.ultimatesolutions.presentation.screen.splash;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hassanwasfy.ultimatesolutions.R;
import com.hassanwasfy.ultimatesolutions.data.source.repository.Repository;
import com.hassanwasfy.ultimatesolutions.databinding.FragmentSplashBinding;

import javax.inject.Inject;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class SplashFragment extends Fragment {


    private FragmentSplashBinding binding;

    @Inject
    Repository repository;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSplashBinding.inflate(inflater, container, false);
        checkLogin();
        return binding.getRoot();
    }

    @SuppressLint("CheckResult")
    private void checkLogin() {
       /*repository.getLoginStatus().subscribeOn(Schedulers.io())
               .observeOn(AndroidSchedulers.mainThread())
               .subscribe(
                       status -> {
                           if (status){
                               NavHostFragment.findNavController(this)
                                       .navigate(R.id.action_splashFragment_to_homeFragment);
                           }else {
                               NavHostFragment.findNavController(this)
                                       .navigate(R.id.action_splashFragment_to_loginFragment);
                           }
                       },
                       error -> {

                       }
               );*/
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}