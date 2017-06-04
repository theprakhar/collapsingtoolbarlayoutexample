package com.example.prakhar.collapsingtoolbarexample;

/**
 * Created by theprakhar on 04-06-2017.
 */

public enum custommodel {
    PAGEONE(R.string.pageone, R.layout.page1),
    PAGETWO(R.string.pagetwo, R.layout.page2);

    private int mTitleResId;
    private int mLayoutResId;

    custommodel(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}


