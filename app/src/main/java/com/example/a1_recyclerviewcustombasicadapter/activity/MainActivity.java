package com.example.a1_recyclerviewcustombasicadapter.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.a1_recyclerviewcustombasicadapter.R;
import com.example.a1_recyclerviewcustombasicadapter.adapter.CustomAdapter;
import com.example.a1_recyclerviewcustombasicadapter.modul.Member;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        List<Member> members = prepareMemberList();
        refreshAdapter(members);
    }
    void initViews(){
        context = this;
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));
    }

    private void refreshAdapter(List<Member> members){
        CustomAdapter adapter = new CustomAdapter(context, members);
        recyclerView.setAdapter(adapter);
    }

    private List<Member> prepareMemberList(){
        List<Member> members = new ArrayList<>();

        for (int i = 1; i < 21; i++){
            members.add(new Member("Odilbek " + i, " Rustamov " + i));
        }
        return members;
    }
}