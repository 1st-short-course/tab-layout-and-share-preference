package com.example.rany.tabslayoutandsharepreference.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.rany.tabslayoutandsharepreference.fragment.FriendRequestFragment;
import com.example.rany.tabslayoutandsharepreference.fragment.HomeFragment;
import com.example.rany.tabslayoutandsharepreference.fragment.NotificationFragment;

public class MyStaticPagerAdapter extends FragmentPagerAdapter {
    public MyStaticPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = HomeFragment.getINSTANCE("home");
                break;
            case 1:
                fragment = FriendRequestFragment.getINSTANCE("request");
                break;
            case 2:
                fragment = NotificationFragment.getINSTANCE("notification");
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Home";
                break;
            case 1:
                title = "Friend";
                break;
            case 2:
                title = "Notification";
                break;
        }
        return title;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
