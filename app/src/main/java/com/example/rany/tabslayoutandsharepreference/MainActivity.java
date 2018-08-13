package com.example.rany.tabslayoutandsharepreference;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rany.tabslayoutandsharepreference.adapter.MyDynamicPagerAdapter;
import com.example.rany.tabslayoutandsharepreference.adapter.MyStaticPagerAdapter;
import com.example.rany.tabslayoutandsharepreference.constant.AppConstant;
import com.example.rany.tabslayoutandsharepreference.fragment.FriendRequestFragment;
import com.example.rany.tabslayoutandsharepreference.fragment.HomeFragment;
import com.example.rany.tabslayoutandsharepreference.fragment.NotificationFragment;
import com.example.rany.tabslayoutandsharepreference.model.MyTabs;

public class MainActivity extends AppCompatActivity {

    private ViewPager pager;
    private TabLayout tabs;
    private int[] icons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        // Static Pager Adapter
//        icons = new int[]{R.drawable.home,
//                R.drawable.friends,
//                R.drawable.notifications};
//
//        MyStaticPagerAdapter adapter =
//                new MyStaticPagerAdapter(getSupportFragmentManager());
//
//        pager.setAdapter(adapter);
//        tabs.setupWithViewPager(pager);
//        for(int i = 0; i < tabs.getTabCount(); i++){
//            tabs.getTabAt(i).setIcon(icons[i]);
//        }

        // Dynamic Pager adapter
        MyDynamicPagerAdapter adapter =
                new MyDynamicPagerAdapter(getSupportFragmentManager());

        adapter.addTab(new MyTabs("Home",
                R.drawable.home_selector, HomeFragment.getINSTANCE(AppConstant.HOME)));
        adapter.addTab(new MyTabs("Friend",
                R.drawable.friend_selector, FriendRequestFragment.getINSTANCE(AppConstant.FRIEND)));
        adapter.addTab(new MyTabs("Notification",
                R.drawable.notification_seletor, NotificationFragment.getINSTANCE(AppConstant.NOTIFICATION)));

        pager.setAdapter(adapter);
        tabs.setupWithViewPager(pager);
        adapter.setIcon(tabs);
    }

    private void initView() {
        pager = findViewById(R.id.vPager);
        tabs = findViewById(R.id.tbTab);
    }
}
