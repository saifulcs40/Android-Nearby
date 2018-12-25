package com.example.saiful.nearbyhospital;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class HospitalRecyclerViewAdapter extends RecyclerView.Adapter<HospitalRecyclerViewAdapter.MyViewHolder> {

    private List<Hospital> hospitalList;
    public HospitalRecyclerViewAdapter(List<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull final ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.model_hospital_lists,viewGroup,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return hospitalList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView hospitalImageIV;
        private TextView hospitalNameTV,hospitalAddressTV;
        private CardView hospitalDetailsCard;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            hospitalImageIV = itemView.findViewById(R.id.hospital_image);
            hospitalNameTV = itemView.findViewById(R.id.hospital_name);
            hospitalAddressTV = itemView.findViewById(R.id.hospital_address);
            hospitalDetailsCard = itemView.findViewById(R.id.hospital_details_card);

        }
    }
}
