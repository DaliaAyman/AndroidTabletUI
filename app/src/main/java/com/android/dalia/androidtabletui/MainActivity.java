package com.android.dalia.androidtabletui;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.android.dalia.androidtabletui.adapters.AndroidVersionsAdapter;
import com.android.dalia.androidtabletui.models.AndroidVersion;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<AndroidVersion> versionsList = new ArrayList<>();
    private RecyclerView recyclerView;
    private AndroidVersionsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new AndroidVersionsAdapter(versionsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareVersionsData();
    }

    private void prepareVersionsData() {
        versionsList.add(new AndroidVersion("Cupcake",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.cupcake),
                1.5, 3));

        versionsList.add(new AndroidVersion("Donut",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.donut),
                1.6, 4));

        versionsList.add(new AndroidVersion("Éclair",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.eclair),
                2.0, 7));

        versionsList.add(new AndroidVersion("Froyo",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.android),
                2.2, 8));

        versionsList.add(new AndroidVersion("Gingerbread",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.gingerbread),
                2.3, 10));

        versionsList.add(new AndroidVersion("Honeycomb",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.honeycomb),
                3.2, 13));

        versionsList.add(new AndroidVersion("Ice cream sandwich",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.icecream),
                4, 15));

        versionsList.add(new AndroidVersion("Jelly Bean",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.jellybeans),
                4.3, 18));

        versionsList.add(new AndroidVersion("Kitkat",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.kitkat),
                4.4, 19));

        versionsList.add(new AndroidVersion("Lollipop",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.lollipop),
                5.1, 22));

        versionsList.add(new AndroidVersion("Marshmallow",
                ContextCompat.getDrawable(getApplicationContext(), R.drawable.marshmallow),
                6, 23));



    }
}
