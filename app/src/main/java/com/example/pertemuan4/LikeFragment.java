package com.example.pertemuan4;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class LikeFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<modelPahlawan> modelPahlawans = new ArrayList<>();
    public LikeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View a = inflater.inflate(R.layout.fragment_like, container, false);
        super.onCreate(savedInstanceState);

        recyclerView = a.findViewById(R.id.rvPahlawan);
        recyclerView.setHasFixedSize(true);
        modelPahlawans.addAll(dataPahlawan.getListData());

        showRecyclerList();
        return a;
        //return inflater.inflate(R.layout.fragment_like, container, false);

    }

//    private <modelPahlawan> modelPahlawans = new ArrayList<>();
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        recyclerView = recyclerView.findViewById(R.id.rvPahlawan);
//
//        recyclerView.setHasFixedSize(true);
//        modelPahlawan.addAll(dataPahlawan.getListData());
//
//        showRecyclerList();
        //Intent intent = intent ();
        //getContext().startActivity(intent);
    }

    private void showRecyclerList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        AdapterPahlawan adapterPahlawan = new AdapterPahlawan(getContext());
        adapterPahlawan.setModelPahlawan(modelPahlawans);
        recyclerView.setAdapter(adapterPahlawan);
    }
}
