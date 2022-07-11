package com.example.android.miwok;

public class word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDE;
    private  static  final int NO_IMAGE_PROVIDE = -1;

    public word(String defaultTranslation, String miwokTranslation){
       mMiwokTranslation = miwokTranslation;
       mDefaultTranslation = defaultTranslation;
    }
    public word(String defaultTranslation, String miwokTranslation,int ImageResourceId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = ImageResourceId;
    }
    public  String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDE;
    }
}
