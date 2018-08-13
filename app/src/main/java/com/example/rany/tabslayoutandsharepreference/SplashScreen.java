package com.example.rany.tabslayoutandsharepreference;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.rany.tabslayoutandsharepreference.share_preference.MySharePreference;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final int status = MySharePreference.getPreference(this);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                switch (status){
                    case 0:
                        startActivity(new Intent(SplashScreen.this,
                                AppIntroActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(SplashScreen.this,
                                LoginActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(SplashScreen.this,
                                MainActivity.class));
                        break;
                }
            }
        }, 2000);


    }
}
