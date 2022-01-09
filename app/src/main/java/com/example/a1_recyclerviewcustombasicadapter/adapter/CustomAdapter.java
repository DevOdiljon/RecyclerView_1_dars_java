package com.example.a1_recyclerviewcustombasicadapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a1_recyclerviewcustombasicadapter.R;
import com.example.a1_recyclerviewcustombasicadapter.modul.Member;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<Member> members;

    public CustomAdapter(Context context, List<Member> members){
        this.context = context;
        this.members = members;
    }

    @Override
    public int getItemCount() {
        return members.size();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mustom_layout, parent, false);
        return new CustomvViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Member member = members.get(position);

        if (holder instanceof CustomvViewHolder){
            TextView first_name = ((CustomvViewHolder) holder).first_name;
            TextView lasr_name = ((CustomvViewHolder) holder).last_name;

            first_name.setText(member.getFristName());
            lasr_name.setText(member.getLastName());
        }
    }

    public  class CustomvViewHolder extends RecyclerView.ViewHolder{
        private View view;
        private TextView first_name, last_name;

        CustomvViewHolder(View v){
            super(v);
            view = v;

            first_name = view.findViewById(R.id.first_name);
            last_name = view.findViewById(R.id.last_name);
        }
    }
}
