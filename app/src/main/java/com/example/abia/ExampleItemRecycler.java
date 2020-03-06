package com.example.abia;

public class ExampleItemRecycler {
    private int mimageResource;
    private String mText1;
    private String mText2;
    public ExampleItemRecycler(int imageResource,String text1,String text2){
        mimageResource=imageResource;
        mText1=text1;
        mText2=text2;
    }
    public int getImageResource(){
        return mimageResource;
    }
    public String getText1(){
        return mText1;
    }
    public String getText2(){
        return mText2;
    }
}
