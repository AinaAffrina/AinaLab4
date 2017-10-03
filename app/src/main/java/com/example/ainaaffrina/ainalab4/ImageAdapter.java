package com.example.ainaaffrina.ainalab4;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Ainaaffrina on 2/10/2017.
 */

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public Integer[] mThumbIds = {

            R.drawable.a, R.drawable.c,
            R.drawable.d, R.drawable.e,
            R.drawable.g, R.drawable.z


    };

    public ImageAdapter (Context c){

        mContext= c;
    }
    @Override
    public int getCount()
    {
        return mThumbIds.length;
    }
    @Override
    public Object getItem (int position)
    {
        return mThumbIds[position];
    }
    @Override
    public long getItemId (int position)
    {
        return 0;
    }
    @Override
    public View getView (int position, View convertView, ViewGroup parent)
    {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(350, 350));

        return imageView;

    }

}
