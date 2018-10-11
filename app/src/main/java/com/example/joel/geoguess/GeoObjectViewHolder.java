package com.example.joel.geoguess;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import static com.example.joel.geoguess.R.id.geoImageView;

public class GeoObjectViewHolder extends RecyclerView.ViewHolder {

    public ImageView geoImage;
    public View view;

    public GeoObjectViewHolder(View itemView) {

        super(itemView);
        geoImage = itemView.findViewById(geoImageView);
        view = itemView;

    }

}
