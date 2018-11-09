package com.example.mylibrary;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class FcUtils {
    public void dfd(Context context, String url, ImageView imageView){
        Glide.with(context)
                .load(url)
                .into(imageView);

    }
}
