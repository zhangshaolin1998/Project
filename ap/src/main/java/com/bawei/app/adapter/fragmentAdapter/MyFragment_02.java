package com.bawei.app.adapter.fragmentAdapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bawei.app.R;
import com.bawei.app.f1Molder.MyFragment_Data;


public class MyFragment_02  extends Fragment {


    private RecyclerView frag_recy;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragment_01, null);
        frag_recy = view.findViewById(R.id.frag_recy);
        MyFragment_Data fragment01Data = new MyFragment_Data();
        frag_recy.setLayoutManager(new GridLayoutManager(getActivity(),5));
        frag_recy.setAdapter(new MyAdaper(getActivity(), fragment01Data.frag01_list_02));
        return view;
    }
}
