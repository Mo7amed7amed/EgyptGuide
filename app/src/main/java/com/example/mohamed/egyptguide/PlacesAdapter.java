package com.example.mohamed.egyptguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Mohamed on 14/12/2017.
 */

public class PlacesAdapter extends FragmentPagerAdapter {
    /**
     * Context of the app
     */
    private Context mContext;

    public PlacesAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CityFragment();
        } else if (position == 1) {
            return new HotelsFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else  {
            return new AboutFragment();
        }
    }


    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.city);
        } else if (position == 1)

        {
            return mContext.getString(R.string.hotels);
        } else if (position == 2)

        {
            return mContext.getString(R.string.restaurants);
        } else

        {
            return mContext.getString(R.string.about);
        }
    }
}