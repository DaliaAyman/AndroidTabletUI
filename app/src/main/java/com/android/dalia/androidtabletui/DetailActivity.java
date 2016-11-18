package com.android.dalia.androidtabletui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.android.dalia.androidtabletui.models.AndroidVersion;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = (ImageView) findViewById(R.id.image_detail);

        Intent intent = getIntent();
        if(intent != null && intent.hasExtra("version")){
            AndroidVersion androidVersion = (AndroidVersion) intent.getSerializableExtra("version");
            Log.d("Version", "Version Name: " + androidVersion.getName());

            imageView.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), androidVersion.getImage()));
        }
    }
}
