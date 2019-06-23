package com.aitekteam.developer.favoritemovie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.aitekteam.developer.favoritemovie.adapters.MoviePager;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pagerMainMovieFull = findViewById(R.id.pager_main_movie_full);
        TabLayout tabMainMovieFull = findViewById(R.id.tab_main_movie_full);

        Bundle bundle = new Bundle();
        bundle.putInt("typeRequest", 1);

        pagerMainMovieFull.setAdapter(new MoviePager(getSupportFragmentManager(), this, bundle));
        tabMainMovieFull.setupWithViewPager(pagerMainMovieFull);
    }
}
