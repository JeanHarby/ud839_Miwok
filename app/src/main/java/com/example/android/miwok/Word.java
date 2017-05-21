package com.example.android.miwok;

/**
 * Created by Jean on 5/13/2017.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiowkTranslation;
    private int mImgResourceId;
    private int mSoundFile;

    public Word(String DefaultTranslation, String miwokTranslation) {
        mDefaultTranslation = DefaultTranslation;
        mMiowkTranslation = miwokTranslation;
    }

    public Word(String DefaultTranslation, String miwokTranslation, int imgResourceId) {
        mDefaultTranslation = DefaultTranslation;
        mMiowkTranslation = miwokTranslation;
        mImgResourceId = imgResourceId;
    }

    public Word(String DefaultTranslation, String miwokTranslation, int imgResourceId, int soundFile) {
        mDefaultTranslation = DefaultTranslation;
        mMiowkTranslation = miwokTranslation;
        mImgResourceId = imgResourceId;
        mSoundFile = soundFile;
    }

    public Word(String DefaultTranslation, String miwokTranslation, int soundFile, String remark) {
        mDefaultTranslation = DefaultTranslation;
        mMiowkTranslation = miwokTranslation;
        mSoundFile = soundFile;
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

    public int getSoundFile() {
        return mSoundFile;
    }
}
