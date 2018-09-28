package com.example.hp.tournigeria;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    //Context of app
    private Context nContext;

    public CategoryAdapter(Context context, FragmentManager fm) {

        super(fm);
        nContext = context;
    }


    @Override
    public Fragment getItem(int i) {
        if (i == 0) {
            return new TinapaFragment();
        } else if (i == 1) {
            return new ObuduFragment();
        } else if (i == 2) {
            return new CalabarFragment();
        } else {
            return new CityFragment();
        }
    }


    @Override
    public int getCount() {
        return 4;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return nContext.getString(R.string.tinapa);
        } else if (position == 1) {
            return nContext.getString(R.string.obudu);
        } else if (position == 2) {
            return nContext.getString(R.string.calabar);
        } else {
            return nContext.getString(R.string.city);
        }
    }
}
