package com.example.rany.tabslayoutandsharepreference.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rany.tabslayoutandsharepreference.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    public static HomeFragment INSTANCE;
    public static HomeFragment getINSTANCE(String tags){
        if(INSTANCE == null)
            INSTANCE = new HomeFragment();
        Bundle bundle = new Bundle();
        bundle.putString("keys", tags);
        INSTANCE.setArguments(bundle);
        return INSTANCE;
    }

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

}
