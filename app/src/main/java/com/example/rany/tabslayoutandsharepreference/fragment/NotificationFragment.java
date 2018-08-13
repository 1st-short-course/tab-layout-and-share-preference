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
public class NotificationFragment extends Fragment {

    public static NotificationFragment INSTANCE;
    public static NotificationFragment getINSTANCE(String tags){
        if(INSTANCE == null)
            INSTANCE = new NotificationFragment();
        Bundle bundle = new Bundle();
        bundle.putString("keys", tags);
        INSTANCE.setArguments(bundle);
        return INSTANCE;
    }

    public NotificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notification, container, false);
    }

}
