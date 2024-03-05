package com.hassanwasfy.ultimatesolutions.presentation.base;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;

public abstract class BaseActivity<VDB extends ViewDataBinding> extends AppCompatActivity {

    protected abstract int getLayoutIdFragment();
    protected abstract ViewModel getViewModel();

    private VDB binding;

    protected VDB getBinding() {
        return binding;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, getLayoutIdFragment());
        binding.setLifecycleOwner(this);
        //binding.setVariable(BR.viewModel, getViewModel());
    }
}
