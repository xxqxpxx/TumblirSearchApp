package com.example.ahmed.tumblrsearchapi.presenter;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.ahmed.tumblrsearchapi.model.Photo;
import com.example.ahmed.tumblrsearchapi.model.QueryUtls;
import com.example.ahmed.tumblrsearchapi.view.SearchActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ahmed on 5/15/17.
 */

public class PhotoLoader extends SearchActivity{

    public  static List<Photo> loadPhotos(String keyword , Context context) {

        RequestQueue queue = Volley.newRequestQueue(context);
        String url = QueryUtls.getTaggedPostQuery(keyword);
         final List<Photo> photosList = new ArrayList<>();

        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray data = response.getJSONArray("response");
                            for (int i = 0; i < data.length(); ++i) {
                                    JSONArray photos = data.getJSONObject(i).getJSONArray("photos");
                                    String photoUrl = photos.getJSONObject(0).getJSONObject("original_size").getString("url");
                                    Photo pic = new Photo(photoUrl);
                                    photosList.add(pic);
                            }
                        } catch (JSONException e) {
                            //some exception handler code.
                        }
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        queue.add(jsObjRequest);
        return photosList;
    }
}
