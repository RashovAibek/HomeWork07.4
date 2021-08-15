package com.example.homework074;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class SecondFragment extends Fragment {

    private ArrayList<Task>list;
    private SecondAdapter secondAdapter;
    private RecyclerView rv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRv(view);
    }

    private void createList() {
        list = new ArrayList<>();
        list.add(new Task("Blank Space","Taylor Swift","3:15","1"));
        list.add(new Task("Watch Me","Silento","5:36","2"));
        list.add(new Task("Earned It","The Weekend","4:51","3"));
        list.add(new Task("The Hills","The weekend","4:34","4"));
        list.add(new Task("Writings On The Wall","Taylor","3:15","5"));
        list.add(new Task("Хентай","The Limbo ft Rahim","3:23","6"));
        list.add(new Task("Тает Дым","Макс Корж","2:53","7"));
    }

    private void initRv(View view) {
        rv = view.findViewById(R.id.rv);
        secondAdapter = new SecondAdapter();
        secondAdapter.setList(list);
        rv.setAdapter(secondAdapter);
    }
}