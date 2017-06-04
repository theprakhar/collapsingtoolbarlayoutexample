package com.example.prakhar.collapsingtoolbarexample;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    CollapsingToolbarLayout collapsingToolbar;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

  setContentView(R.layout.activity_main);
        viewPager=(ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(new customadaptar(this));
        image = (ImageView)findViewById(R.id.header);
        image.setImageResource(R.drawable.header);
        collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.htab_collapse_toolbar);
        collapsingToolbar.setTitle("Collapsing Toolbar Example");
    }
}
