package com.example.recyclerview2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountryViewHolder extends RecyclerView.ViewHolder {

    private TextView tvCountry;

    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCountry = itemView.findViewById(R.id.tv_countries);
    }
    public void bind(String country){
        tvCountry.setText(country);
    }
}
