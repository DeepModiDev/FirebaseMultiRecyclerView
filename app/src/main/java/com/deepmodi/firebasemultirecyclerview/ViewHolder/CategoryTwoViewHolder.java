package com.deepmodi.firebasemultirecyclerview.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.deepmodi.firebasemultirecyclerview.R;

public class CategoryTwoViewHolder extends RecyclerView.ViewHolder {

    public TextView dataName;
    public TextView dataId;
    public TextView dataAge;

    public CategoryTwoViewHolder(@NonNull View itemView) {
        super(itemView);

        dataId = itemView.findViewById(R.id.data_id);
        dataAge = itemView.findViewById(R.id.data_age);
        dataName = itemView.findViewById(R.id.data_name);
    }
}
