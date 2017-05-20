package com.example.android.miwok;

/**
 * Created by Jean on 5/13/2017.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiowkTranslation;
    private int mImgResourceId;

    public Word(String DefaultTranslation, String miwokTranslation) {
        mDefaultTranslation = DefaultTranslation;
        mMiowkTranslation = miwokTranslation;
    }

    public Word(String DefaultTranslation, String miwokTranslation, int imgResourceId) {
        mDefaultTranslation = DefaultTranslation;
        mMiowkTranslation = miwokTranslation;
        mImgResourceId = imgResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiowkTranslation;
    }

    public int getImgResourceId() {
        return mImgResourceId;
    }
}
