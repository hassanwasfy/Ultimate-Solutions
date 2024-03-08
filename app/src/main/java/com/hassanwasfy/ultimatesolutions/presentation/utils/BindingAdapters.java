package com.hassanwasfy.ultimatesolutions.presentation.utils;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.hassanwasfy.ultimatesolutions.R;

public class BindingAdapters {

    @BindingAdapter("app:loadingState")
    public static void loadingState(ProgressBar progressBar, boolean show) {
        progressBar.setVisibility(show ? View.VISIBLE : View.GONE);
    }
    @BindingAdapter("app:loadingState")
    public static void loadingState(ConstraintLayout constraintLayout, boolean show) {
        constraintLayout.setVisibility(show ? View.VISIBLE : View.GONE);
    }

    @BindingAdapter("app:emptyListImage")
    public static void setEmptyListImage(ImageView imageView, int listSize) {
        imageView.setVisibility(listSize == 0 ? View.VISIBLE : View.GONE);
    }
    @BindingAdapter("app:emptyListImage")
    public static void setEmptyListImage(RecyclerView recyclerView, int listSize) {
        recyclerView.setVisibility(listSize == 0 ? View.VISIBLE : View.GONE);
    }


    @BindingAdapter("app:setLabel")
    public static void setLabel(MaterialTextView textView, Boolean value) {
        if (value) {
            textView.setText(R.string.show_less);
        } else {
            textView.setText(R.string.show_more);
        }
    }

    @BindingAdapter("app:isShowLess")
    public static void setLayoutVisibility(TextInputLayout layout, boolean value) {
        if (value) {
            layout.setVisibility(View.VISIBLE);
        } else {
            layout.setVisibility(View.GONE);
        }
    }



}
