package com.ljaymori.parallaxpagersample;

import android.support.v4.view.ViewPager;
import android.view.View;

public class ParallaxPagerTransformer implements ViewPager.PageTransformer {

    private int imageID;
    private int textID;

    public ParallaxPagerTransformer(int imageID, int textID) {
        this.imageID = imageID;
        this.textID = textID;
    }

    @Override
    public void transformPage(View view, float position) {
        View parallaxImageView = view.findViewById(imageID);
        View parallaxTextView = view.findViewById(textID);

        int width = parallaxImageView.getWidth();

        parallaxImageView.setTranslationX(-position * (width / 2));
//        parallaxTextView.setTranslationX(position * (width / 2));
//        parallaxTextView.setRotation(position * 180);
//        parallaxTextView.setScaleX(1 + position);
//        parallaxTextView.setScaleY(1 + position);
//        parallaxTextView.setAlpha(1 + position);

    }
}