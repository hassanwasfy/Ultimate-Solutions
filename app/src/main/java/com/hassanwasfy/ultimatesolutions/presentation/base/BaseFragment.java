package com.hassanwasfy.ultimatesolutions.presentation.base;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import com.google.android.material.snackbar.Snackbar;
import com.hassanwasfy.ultimatesolutions.R;


public abstract class BaseFragment<VDB extends ViewDataBinding> extends Fragment {

    protected abstract int getLayoutIdFragment();

    protected abstract ViewModel getViewModel();

    private VDB binding;

    protected VDB getBinding() {
        return binding;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, getLayoutIdFragment(), container, false);
        binding.setLifecycleOwner(getViewLifecycleOwner());
        //binding.setVariable(BR.viewModel, getViewModel());
        return binding.getRoot();
    }

    /*public <T> void collect(Flow<T> flow, Function1<? super T, Unit> action) {
        lifecycleScope.launch(() -> {
            repeatOnLifecycle(Lifecycle.State.STARTED, () -> {
                flow.collect(action);
            });
        });
    }*/

    protected void changeStatusBarColor() {
        int statusBarColor = ContextCompat.getColor(requireContext(), R.color.dark_gray);
        requireActivity().getWindow().setStatusBarColor(statusBarColor);
    }

    @SuppressLint("ResourceAsColor")
    @RequiresApi(api = Build.VERSION_CODES.S)
    protected void resetStatusBarColor() {
        int defaultStatusBarColor = android.R.color.system_accent1_0;
        requireActivity().getWindow().setStatusBarColor(defaultStatusBarColor);
    }

    protected void handleOnError(String message) {
        if (!message.isEmpty()) {
            Snackbar.make(getBinding().getRoot(), message, Snackbar.LENGTH_SHORT).show();
        }
    }
}
