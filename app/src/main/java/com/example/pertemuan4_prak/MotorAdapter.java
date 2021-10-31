package com.example.pertemuan4_prak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MotorAdapter extends RecyclerView.Adapter<MotorAdapter.MotorViewHolder>
{
    private ArrayList<Motor> dataList;
    public MotorAdapter(ArrayList<Motor> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public MotorAdapter.MotorViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_motor, parent, false);
        return new MotorViewHolder(view);
    }
    public void onBindViewHolder(MotorViewHolder holder, int position) {
        holder.Foto.setImageResource(dataList.get(position).getFoto());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtjenis.setText(dataList.get(position).getJenis());
        holder.txtcc.setText(dataList.get(position).getCc());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MotorViewHolder extends RecyclerView.ViewHolder
    {
        private TextView txtNama, txtjenis, txtcc;
        private ImageView Foto;
        public MotorViewHolder(View itemView)
        {
            super(itemView);
            Foto = (ImageView) itemView.findViewById(R.id.foto);
            txtNama = (TextView)itemView.findViewById(R.id.txt_nama);
            txtjenis = (TextView) itemView.findViewById(R.id.txt_jenis);
            txtcc = (TextView) itemView.findViewById(R.id.txt_cc);
        }
    }
}

