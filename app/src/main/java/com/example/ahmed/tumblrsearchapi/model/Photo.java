package com.example.ahmed.tumblrsearchapi.model;

/**
 * Created by ahmed on 5/15/17.
 */
public class Photo {

    private String photoUrl;

    public Photo(){}

    public Photo(String photoUrl)
    {
        this .photoUrl = photoUrl;
    }

    public String getphotoUrl()
    {
        return photoUrl;
    }

    public void setphotoUrl(String photoUrl)
    {
        this.photoUrl= photoUrl;
    }

}
