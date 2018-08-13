package com.example.rany.tabslayoutandsharepreference;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rany.tabslayoutandsharepreference.constant.AppConstant;
import com.example.rany.tabslayoutandsharepreference.fragment.FriendRequestFragment;
import com.example.rany.tabslayoutandsharepreference.fragment.HomeFragment;
import com.example.rany.tabslayoutandsharepreference.fragment.NotificationFragment;
import com.example.rany.tabslayoutandsharepreference.share_preference.MySharePreference;
import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.github.paolorotolo.appintro.model.SliderPage;

public class AppIntroActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_app_intro);

        // Custom fragment
//        addSlide(HomeFragment.getINSTANCE(AppConstant.HOME));
//        addSlide(FriendRequestFragment.getINSTANCE(AppConstant.FRIEND));
//        addSlide(NotificationFragment.getINSTANCE(AppConstant.NOTIFICATION));

        // old version
//        addSlide(AppIntroFragment.newInstance(
//                "Home", "Testing", R.drawable.ka,
//                getColor(R.color.colorAccent)));


        SliderPage sliderPage = new SliderPage();
        sliderPage.setTitle("Khmer Academy");
        sliderPage.setDescription("E-learining content");
        sliderPage.setImageDrawable(R.drawable.ka);
        sliderPage.setBgColor(getColor(R.color.colorPrimary));
        addSlide(AppIntroFragment.newInstance(sliderPage));

        SliderPage sliderPage2 = new SliderPage();
        sliderPage2.setTitle("Khmer Academy");
        sliderPage2.setDescription("E-learining content");
        sliderPage2.setImageDrawable(R.drawable.ka);
        sliderPage2.setBgColor(getColor(R.color.colorPrimaryDark));
        addSlide(AppIntroFragment.newInstance(sliderPage2));

        SliderPage sliderPage3 = new SliderPage();
        sliderPage3.setTitle("Khmer Academy");
        sliderPage3.setDescription("E-learining content");
        sliderPage3.setImageDrawable(R.drawable.ka);
        sliderPage3.setBgColor(getColor(R.color.colorAccent));
        addSlide(AppIntroFragment.newInstance(sliderPage3));

        setVibrate(true);
        setVibrateIntensity(30);

        setSlideOverAnimation();

    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        MySharePreference.setPreference(this, 1);
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        MySharePreference.setPreference(this, 1);
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }
}
