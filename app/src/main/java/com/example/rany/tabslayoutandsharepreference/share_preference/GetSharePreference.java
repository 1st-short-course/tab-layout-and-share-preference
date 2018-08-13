package com.example.rany.tabslayoutandsharepreference.share_preference;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.rany.tabslayoutandsharepreference.R;
import com.example.rany.tabslayoutandsharepreference.constant.AppConstant;
import com.example.rany.tabslayoutandsharepreference.model.Article;
import com.google.gson.Gson;

public class GetSharePreference extends AppCompatActivity {

    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_share_preference);

        name = findViewById(R.id.tvGetName);

        SharedPreferences preferences = getSharedPreferences(AppConstant.MY_PREFERENCE,
                MODE_PRIVATE);
        // get object as json format
        String resultJson = preferences.getString(AppConstant.ARTICLE_OBJ, "n/a");

        Gson gson = new Gson();

        // deserialize from json to java object
        Article article = gson.fromJson(resultJson, Article.class);

        String result = preferences.getString(AppConstant.PRE_NAME, "n/a");

        name.setText(article.getTitle()+" "+ article.getDescription());


    }
}
