package com.example.hp.tournigeria;

public class Ipo {

    /**
     * Header for ipo
     */
    private String mHeader;

    /**
     * Description for ipo
     */
    private String mDescription;

    /**
     * Image Resource for ipo
     */
    private int mImageResourceId;


    //*Initialize param/
    //    @param  header for ipo
    //    @param  description for ipo
    //    @param  Image Resource
    //   CONSTRUCTOR / /

    public Ipo(String header, String description, int imageResourceId) {
        mHeader = header;
        mDescription = description;
        mImageResourceId = imageResourceId;
        }


    /*Get Header*/
    public String getHeader() {
        return mHeader;
    }

    /*Get Description*/
    public String getDescription() {
        return mDescription;
    }

    /*Get Image Resourxe ID*/
    public int getImageResourceId() {
        return mImageResourceId;
    }










}
