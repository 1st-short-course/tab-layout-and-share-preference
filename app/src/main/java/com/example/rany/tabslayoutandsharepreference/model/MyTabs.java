package com.example.rany.tabslayoutandsharepreference.model;

import android.support.v4.app.Fragment;

public class MyTabs {

    private String title;
    private int icon;
    private Fragment fragment;

    public MyTabs(String title, int icon, Fragment fragment) {
        this.title = title;
        this.icon = icon;
        this.fragment = fragment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }
}
