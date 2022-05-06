package com.example.networking;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class RecyclerAdapter  extends RecyclerView.Adapter<RecyclerAdapter.MountainViewHolder> {

    private ArrayList<Mountain> mountains;

    public RecyclerAdapter(ArrayList<Mountain> mountains) {
        this.mountains = mountains;
    }

    @NonNull
    @Override
    public RecyclerAdapter.MountainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mountain_item, parent, false);
        return new MountainViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MountainViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }

    // VIEW HOLDER
    public class MountainViewHolder extends RecyclerView.ViewHolder {

        private TextView name, location, size;
        private ImageView image;

        public MountainViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.mountainName);
            location = itemView.findViewById(R.id.mountainLocation);
            size = itemView.findViewById(R.id.mountainSize);
            image = itemView.findViewById(R.id.mountainImage);
        }

    }

}
