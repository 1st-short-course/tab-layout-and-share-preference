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
public class FriendRequestFragment extends Fragment {

    public static FriendRequestFragment INSTANCE;
    public static FriendRequestFragment getINSTANCE(String tags){
        if(INSTANCE == null)
            INSTANCE = new FriendRequestFragment();
        Bundle bundle = new Bundle();
        bundle.putString("keys", tags);
        INSTANCE.setArguments(bundle);
        return INSTANCE;
    }


    public FriendRequestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_friend_request, container, false);
    }

}
