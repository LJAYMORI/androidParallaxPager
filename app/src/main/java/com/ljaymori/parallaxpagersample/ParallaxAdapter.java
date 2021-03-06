package com.ljaymori.parallaxpagersample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

public class ParallaxAdapter extends FragmentStatePagerAdapter {

    private ArrayList<ParallaxFragment> mFragments = new ArrayList<ParallaxFragment>();
    private ViewPager mPager;

    public ParallaxAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addAll(ArrayList<ParallaxFragment> list) {
        mFragments.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int i) {
        return mFragments.get(i);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    public void add(ParallaxFragment parallaxFragment) {
//        parallaxFragment.setAdapter(this);
        mFragments.add(parallaxFragment);
        notifyDataSetChanged();
//        mPager.setCurrentItem(getCount() - 1, true);

    }

    public void remove(int i) {
        mFragments.remove(i);
        notifyDataSetChanged();
    }

    public void remove(ParallaxFragment parallaxFragment) {
        mFragments.remove(parallaxFragment);

        int pos = mPager.getCurrentItem();
        notifyDataSetChanged();

        mPager.setAdapter(this);
        if (pos >= this.getCount()) {
            pos = this.getCount() - 1;
        }
        mPager.setCurrentItem(pos, true);

    }

    public int getItemPosition(Object object) {
        return mFragments.indexOf(object);
    }

    public void setPager(ViewPager pager) {
        mPager = pager;
    }
}
