package com.ljaymori.parallaxpagersample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class ParallaxFragment extends Fragment {

    private ImageView background;
    private int backgroundResource;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_parallax, container, false);

        background = (ImageView) v.findViewById(R.id.imageView_background_paral);
        background.setImageResource(backgroundResource);

        return v;
    }

    public void setBackgroundResource(int res) {
        backgroundResource = res;
    }
}
