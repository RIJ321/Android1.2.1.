package com.example.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    private TextView id;
    TextView title;
    TextView deskription;
    TextView date;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        id = itemView.findViewById(R.id.id);
        title = itemView.findViewById(R.id.west);
        deskription = itemView.findViewById(R.id.deskription);
        date = itemView.findViewById(R.id.date);
    }

    public void onBind(Values s) {
        id.setText(s.getId());
        deskription.setText(s.getDescription());
        title.setText(s.getTitle());
        date.setText(s.getDate());


    }
}
