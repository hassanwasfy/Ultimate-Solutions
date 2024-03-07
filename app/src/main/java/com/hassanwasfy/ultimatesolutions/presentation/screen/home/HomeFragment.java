package com.hassanwasfy.ultimatesolutions.presentation.screen.home;

import android.content.Context;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.hassanwasfy.ultimatesolutions.R;
import com.hassanwasfy.ultimatesolutions.databinding.FragmentHomeBinding;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class HomeFragment extends Fragment {

    @Inject
    Context applicationContext;

    private FragmentHomeBinding binding;
    private HomeViewModel viewModel;
    private BillsAdapter adapter;


    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        View v = binding.getRoot();
        viewModel = new ViewModelProvider(this, getDefaultViewModelProviderFactory()).get(HomeViewModel.class);
        adapter = new BillsAdapter(applicationContext);
        viewModel.getStateLiveData().observe(getViewLifecycleOwner(), homeDataHolder -> {
            if (homeDataHolder != null) {
                adapter.setData(homeDataHolder.getDeliveryBills());
                adapter.notifyDataSetChanged();
                binding.textLabelUserName.setText(homeDataHolder.getUserName());
            }
        });
        binding.recyclerViewOrdersList.setAdapter(adapter);
        return v;
    }

}