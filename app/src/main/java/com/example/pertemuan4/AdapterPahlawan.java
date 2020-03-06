package com.example.pertemuan4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterPahlawan extends RecyclerView.Adapter<AdapterPahlawan.ViewHolder> {
    private ArrayList<modelPahlawan> modelPahlawan;
    private Context context;
    private LinearLayout vClick;
    public AdapterPahlawan(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pahlawan,parent, false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        Glide.with(context).load(getModelPahlawan().get(position).heroesImages).into(holder.ivPahlawan);
        holder.tvNama.setText(getModelPahlawan().get(position).heroNames);
        vClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, IntentActivity.class);
                intent.putExtra("desc", getModelPahlawan().get(position).heroDetails);
                intent.putExtra("title", getModelPahlawan().get(position).heroNames);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getModelPahlawan().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivPahlawan;
        private TextView tvNama;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPahlawan = itemView.findViewById(R.id.ivPahlawan);
            tvNama = itemView.findViewById(R.id.tvNama);
//            vClick = itemView.findViewById(R.id.vClick);

        }
    }

    public ArrayList<modelPahlawan> getModelPahlawan() {
        return modelPahlawan;
    }

    public void setModelPahlawan(ArrayList<modelPahlawan> modelPahlawan) {
        this.modelPahlawan = modelPahlawan;
    }
}
