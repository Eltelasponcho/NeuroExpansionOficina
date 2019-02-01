package com.example.mauri.neuroexpansionoficina;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdpter extends RecyclerView.Adapter<MyAdpter.ViewHolder> {
private List<String> names;
private int layout;
private OnItemClickListener itemClickListener;

public MyAdpter(List<String> names, int layout, OnItemClickListener listener){
    this.names=names;
    this.layout=layout;
    this.itemClickListener = listener;
}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
    View v = LayoutInflater.from(parent.getContext()).inflate(layout, parent, false) ;
    ViewHolder vh = new ViewHolder(v);
    return vh;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.bind(names.get(position), itemClickListener);
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.name =(TextView) itemView.findViewById(R.id.textViewName);
        }
        public void bind(final String name, final OnItemClickListener listener){
            this.name.setText(name);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(name, getAdapterPosition());
                }
            });
        }
    }
public interface OnItemClickListener
{
        void onItemClick(String name, int position);
}

}
