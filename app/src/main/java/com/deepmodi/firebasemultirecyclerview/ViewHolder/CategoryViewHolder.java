package com.deepmodi.firebasemultirecyclerview.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.deepmodi.firebasemultirecyclerview.R;

public class CategoryViewHolder extends RecyclerView.ViewHolder {

    public TextView categoryName;
    public RecyclerView category_recyclerView;
    public RecyclerView.LayoutManager manager;


    public CategoryViewHolder(@NonNull View itemView) {
        super(itemView);

        manager = new LinearLayoutManager(itemView.getContext(),LinearLayoutManager.HORIZONTAL,false);
        categoryName = itemView.findViewById(R.id.category_name);
        category_recyclerView = itemView.findViewById(R.id.recyclerView);
        category_recyclerView.setLayoutManager(manager);
    }
}
