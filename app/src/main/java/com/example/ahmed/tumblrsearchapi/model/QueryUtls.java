package com.example.ahmed.tumblrsearchapi.model;

/**
 * Created by ahmed on 5/15/17.
 */

public class QueryUtls {

    private String keyword;

    public static String getTaggedPostQuery(String keyword)
    {
        String base = "api.tumblr.com/v2/tagged?tag=";
        String apiKey = "&api_key=fuiKNFp9vQFvjLNvx4sUwti4Yb5yGutBN4Xh10LXZhhRKjWlV4";
        String finalrequest =  base + keyword + apiKey;
        return finalrequest ;
    }


}
