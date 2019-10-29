package com.example.reclyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;


class keluargaAdapter extends RecyclerView.Adapter<keluargaAdapter.keluargaViewHolder> {

    private ArrayList<keluarga> dataList;

    public keluargaAdapter(ArrayList<keluarga> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public keluargaAdapter.keluargaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_keluarga, parent, false);
        return new keluargaViewHolder(view);
    }

    public void onBindViewHolder(keluargaViewHolder holder, int position) {
        holder.txtnama.setText(dataList.get(position).getNama());
        holder.txtstatus.setText(dataList.get(position).getStatus());
        holder.foto.setImageResource(dataList.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class keluargaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtnama, txtstatus;
        private ImageView foto;

        public keluargaViewHolder(View itemView) {
            super(itemView);
            txtnama = (TextView) itemView.findViewById(R.id.txt_nama);
            txtstatus = (TextView) itemView.findViewById(R.id.txt_status);
            foto = (ImageView) itemView.findViewById(R.id.gambarkeluarga);
        }
    }


}
