package com.example.app.recyclerviewsimple;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by APP on 3/17/2018.
 */

public class adapter extends RecyclerView.Adapter<adapter.programmingviewholder> {

    private ArrayList<String> countries;

    public adapter(ArrayList<String> countries) {
        this.countries = countries;
    }

    @Override
    public programmingviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.card,parent,false);
        return new programmingviewholder(view);
    }

    @Override
    public void onBindViewHolder(programmingviewholder holder, int position) {
        holder.contry.setText(countries.get(position));

    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public class programmingviewholder extends RecyclerView.ViewHolder{
        private TextView contry;
        public programmingviewholder(View itemView) {
            super(itemView);
            contry=(TextView)itemView.findViewById(R.id.txt);
        }
    }

}
