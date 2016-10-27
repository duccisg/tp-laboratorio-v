package com.utn.tp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.utn.tp.R;

/**
 * Created by sebastian.g.ducci on 10/16/2016.
 */
public class CategoryViewHolder extends RecyclerView.ViewHolder {

    TextView txtName;
    TextView txtDesc;
    CheckBox favorite;
    ImageView photo;

    public CategoryViewHolder(View itemView) {
        super(itemView);
        txtName = (TextView) itemView.findViewById(R.id.category_item_name);
        txtDesc = (TextView) itemView.findViewById(R.id.category_item_desc);
        favorite = (CheckBox) itemView.findViewById(R.id.category_item_favorite);
        photo = (ImageView) itemView.findViewById(R.id.category_item_photo);
    }
}
