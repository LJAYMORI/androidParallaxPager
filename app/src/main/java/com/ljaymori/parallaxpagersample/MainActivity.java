package com.ljaymori.parallaxpagersample;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity {

    private ViewPager viewPager;
    private ParallaxAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);

        mAdapter = new ParallaxAdapter(getSupportFragmentManager());
        mAdapter.addAll(initData());


        viewPager.setAdapter(mAdapter);

        ParallaxPagerTransformer pt = new ParallaxPagerTransformer(
                R.id.imageView_background_paral,
                R.id.text_title_paral
        );

        viewPager.setPageTransformer(false, pt);
    }

    private ArrayList<ParallaxFragment> initData() {
        ArrayList<ParallaxFragment> list = new ArrayList<ParallaxFragment>();

        int[] images = new int[] {
                R.drawable.background_image1,
                R.drawable.background_image2,
                R.drawable.background_image3,
                R.drawable.background_image1,
                R.drawable.background_image2,
                R.drawable.background_image3,
                R.drawable.background_image1,
                R.drawable.background_image2,
                R.drawable.background_image3
        };

        for(int i=0; i<images.length; i++) {
            ParallaxFragment f = new ParallaxFragment();
            f.setBackgroundResource(images[i]);

            list.add(f);
        }

        return list;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
