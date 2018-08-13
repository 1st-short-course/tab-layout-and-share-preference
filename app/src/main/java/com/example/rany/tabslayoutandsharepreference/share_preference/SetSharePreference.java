package com.example.rany.tabslayoutandsharepreference.share_preference;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.rany.tabslayoutandsharepreference.R;
import com.example.rany.tabslayoutandsharepreference.constant.AppConstant;
import com.example.rany.tabslayoutandsharepreference.model.Article;
import com.google.gson.Gson;

public class SetSharePreference extends AppCompatActivity {

    private Button btnSave, btnShow;
    private EditText name, title, des;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_share_preference);

        btnSave = findViewById(R.id.btnSave);
        btnShow = findViewById(R.id.btnShow);
        name = findViewById(R.id.tvName);
        title = findViewById(R.id.tvTitle);
        des = findViewById(R.id.tvDescription);

        SharedPreferences preferences =
                getSharedPreferences(AppConstant.MY_PREFERENCE, MODE_PRIVATE);

        final SharedPreferences.Editor editor = preferences.edit();

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = (int) (System.currentTimeMillis()/1000);
                Article article = new Article(id,
                        title.getText().toString(), des.getText().toString());

                editor.putString(AppConstant.ARTICLE_OBJ, new Gson().toJson(article));
                editor.putString(AppConstant.PRE_NAME, name.getText().toString());
                editor.apply();
            }
        });
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SetSharePreference.this,
                        GetSharePreference.class));
            }
        });

    }
}
