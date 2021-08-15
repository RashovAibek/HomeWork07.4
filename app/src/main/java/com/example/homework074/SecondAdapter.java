package com.example.homework074;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.SecondHolder> {
    @NonNull
    private ArrayList<Task>list;
    @Override
    public SecondHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new SecondHolder(view);
    }

    public void setList(@NonNull ArrayList<Task> list) {
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull SecondHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class SecondHolder extends RecyclerView.ViewHolder {
        private TextView tv1, tv2 , tv3 , tv4;
        public SecondHolder(@NonNull View itemView) {
            super(itemView);
            tv1 = itemView.findViewById(R.id.tx1);
            tv2 = itemView.findViewById(R.id.name);
            tv3 = itemView.findViewById(R.id.name2);
            tv4 = itemView.findViewById(R.id.tv_time);
        }

        public void onBind(Task task) {
            tv1.setText(task.getPosition());
            tv2.setText(task.getName());
            tv3.setText(task.getName2());
            tv4.setText(task.getTime());

        }
    }
}
