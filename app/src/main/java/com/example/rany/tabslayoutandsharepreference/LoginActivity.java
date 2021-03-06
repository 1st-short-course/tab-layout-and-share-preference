package com.example.rany.tabslayoutandsharepreference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rany.tabslayoutandsharepreference.share_preference.MySharePreference;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MySharePreference.setPreference(LoginActivity.this,
                        2);
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });

    }
}
