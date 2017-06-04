package com.example.prakhar.collapsingtoolbarexample;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by theprakhar on 04-06-2017.
 */

public class customadaptar extends PagerAdapter

{

    private Context mContext;

    public customadaptar(Context context) {
        mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        custommodel modelObject = custommodel.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getLayoutResId(), collection, false);
        collection.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return custommodel.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        custommodel customPagerEnum = custommodel.values()[position];
        return mContext.getString(customPagerEnum.getTitleResId());}

    public Parcelable saveState() {
        // Do Nothing
        return null;
    }
}




