package com.example.rany.tabslayoutandsharepreference.adapter;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.rany.tabslayoutandsharepreference.model.MyTabs;

import java.util.ArrayList;
import java.util.List;

public class MyDynamicPagerAdapter extends FragmentPagerAdapter {

    private List<MyTabs> tabsList;

    public MyDynamicPagerAdapter(FragmentManager fm) {
        super(fm);
        tabsList = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int position) {
        return tabsList.get(position).getFragment();
    }

    // add tab to tabsList
    public void addTab(MyTabs tabs){
        tabsList.add(tabs);
    }

    @Override
    public int getCount() {
        return tabsList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabsList.get(position).getTitle();
    }

    public void setIcon(TabLayout tabLayout){
        for(int i= 0; i < tabLayout.getTabCount(); i++){
            tabLayout.getTabAt(i).setIcon(tabsList.get(i).getIcon());
        }
    }
}
