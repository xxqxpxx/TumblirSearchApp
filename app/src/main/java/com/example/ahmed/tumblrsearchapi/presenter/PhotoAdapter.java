package com.example.ahmed.tumblrsearchapi.presenter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ahmed.tumblrsearchapi.R;
import com.example.ahmed.tumblrsearchapi.model.Photo;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ahmed on 5/15/17.
 */


public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.MyViewHolder> {

    private Context mContext;
    private List<Photo> photos;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView photoUrl;

        public MyViewHolder(View view) {
            super(view);
            photoUrl = (ImageView) view.findViewById(R.id.photoUrl);
        }
    }

    public PhotoAdapter(Context mContext, List<Photo> albumList) {
        this.mContext = mContext;
        this.photos = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Photo photo = photos.get(position);
        Picasso.with(mContext)
                .load(Uri.parse(photo.getphotoUrl()))
                .error(R.drawable.logo)
                .into(holder.photoUrl);
    }

    @Override
    public int getItemCount() {
        return photos.size();
    }

}
