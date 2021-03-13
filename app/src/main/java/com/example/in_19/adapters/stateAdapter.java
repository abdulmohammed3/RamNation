package com.example.in_19.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.in_19.R;
import com.example.in_19.models.State;

import java.util.List;

public class stateAdapter extends RecyclerView.Adapter<stateAdapter.ViewHolder> {

    Context context;
    List<State> states;

    public stateAdapter(Context context, List<State> states){
        this.context = context;
        this.states = states;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View stateView = LayoutInflater.from(context).inflate(R.layout.activity_item_state, parent,false);
            return new ViewHolder(stateView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            State state = states.get(position);
    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout container;
        TextView tvStateName;
        TextView tvDashboardLink;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvStateName = itemView.findViewById(R.id.tvStateName);
            tvDashboardLink = itemView.findViewById(R.id.tvDashboardLink);
        }
    }
}
