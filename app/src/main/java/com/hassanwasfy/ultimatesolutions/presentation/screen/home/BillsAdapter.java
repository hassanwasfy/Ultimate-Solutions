package com.hassanwasfy.ultimatesolutions.presentation.screen.home;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hassanwasfy.ultimatesolutions.databinding.OrderCardItemBinding;
import com.hassanwasfy.ultimatesolutions.domain.model.OneBillItem;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class BillsAdapter extends RecyclerView.Adapter<BillsAdapter.ViewHolder> {

    private ArrayList<OneBillItem> data;
    private final LayoutInflater inflater;

    public BillsAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
        this.data = new ArrayList<>();
    }

    public void setData(ArrayList<OneBillItem> data) {
        this.data = data;
    }

    public ArrayList<OneBillItem> getData() {
        return data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        OrderCardItemBinding binding = OrderCardItemBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final OrderCardItemBinding binding;

        public ViewHolder(@NonNull OrderCardItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        @SuppressLint("SetTextI18n")
        public void bind(OneBillItem item) {
            String amount = formatAmount(item.getBillAmount());
            binding.textDateValue.setText(item.getBillDate());
            binding.textPriceValue.setText(amount);
            binding.textStatusValue.setText(item.getBillType());
            binding.textLebelSerial.setText("#"+item.getBillSerial());
        }

        private String formatAmount(String amount) {
            Double value = Double.parseDouble(amount);
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String formattedNumber = decimalFormat.format(value);
            double roundedNumber = Double.parseDouble(formattedNumber);
            return String.valueOf(roundedNumber);
        }
    }
}

