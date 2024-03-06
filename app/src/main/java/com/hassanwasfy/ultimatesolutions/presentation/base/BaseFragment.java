package com.hassanwasfy.ultimatesolutions.presentation.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public abstract class BaseFragment<T extends ViewDataBinding,V extends ViewModel> extends Fragment {


    protected T binding;
    protected V viewModel;

    @LayoutRes
    protected abstract int getLayoutId();
    protected abstract Class<V> getViewModelClass();


    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = DataBindingUtil.inflate(
                inflater,
                getLayoutId(),
                container,
                false
        );
        View v = binding.getRoot();
        viewModel = new ViewModelProvider(this).get(getViewModelClass());
        return v;
    }




}
