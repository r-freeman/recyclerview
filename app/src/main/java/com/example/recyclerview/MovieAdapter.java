package com.example.recyclerview;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieAdapter extends RecyclerView.Adapter {

    // creates new views, called by the LayoutManager
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    // Replaces the content of the view, called by the LayoutManager
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    // returns the size of the dataset to the LayoutManager
    @Override
    public int getItemCount() {
        return 0;
    }
}
