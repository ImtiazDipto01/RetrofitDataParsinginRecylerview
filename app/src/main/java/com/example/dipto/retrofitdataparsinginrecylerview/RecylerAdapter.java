package com.example.dipto.retrofitdataparsinginrecylerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dipto.retrofitdataparsinginrecylerview.model.RecylerNetworkModel;
import com.example.dipto.retrofitdataparsinginrecylerview.model.ServerResponse;

import java.util.Collections;
import java.util.List;

/**
 * Created by Dipto on 8/15/2017.
 */

public class RecylerAdapter extends RecyclerView.Adapter<RecylerAdapter.RecylerViewHolder> {

    private final LayoutInflater inflater;
    private List<ServerResponse> list = Collections.emptyList() ;
    private Context context ;

    public RecylerAdapter(Context context, List<ServerResponse> list){
        this.context = context ;
        this.list = list ;
        inflater = LayoutInflater.from(context) ;
   }

    @Override
    public RecylerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_recylerview, parent, false) ;
        RecylerViewHolder recylerViewHolder = new RecylerViewHolder(view) ;
        return recylerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecylerViewHolder holder, int position) {
        ServerResponse serverResponse = list.get(position) ;
        holder.name.setText(serverResponse.getName());
        holder.email.setText(serverResponse.getEmail());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecylerViewHolder extends RecyclerView.ViewHolder{

        TextView name, email ;

        public RecylerViewHolder(View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.name);
            email = (TextView) itemView.findViewById(R.id.email) ;
        }
    }
}
