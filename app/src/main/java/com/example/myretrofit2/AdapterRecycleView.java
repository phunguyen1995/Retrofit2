package com.example.myretrofit2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myretrofit2.databinding.ItemRecycleviewBinding;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class AdapterRecycleView extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private List<MovieModel> data1 = new ArrayList<MovieModel>();

    public AdapterRecycleView(List<MovieModel> results) {
        this.data1=results;
    }

    @NonNull
    @NotNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        ItemRecycleviewBinding binding= ItemRecycleviewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder( RecyclerView.ViewHolder holder, int position) {
        ((AdapterRecycleView.ViewHolder) holder).setData1(data1.get(position), position);
    }

    @Override
    public int getItemCount() {
        return data1.size();
    }
    public   class ViewHolder extends RecyclerView.ViewHolder {
        ItemRecycleviewBinding binding;
        public ViewHolder( ItemRecycleviewBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }
        public void setData1(MovieModel data1, int position){
            binding.tvitem.setText(" fgghjklghgj");

            // binding.tvClass.setText(data1.lop);
            //  binding.tvDate.setText(data1.ngaythem);

        }}
}
