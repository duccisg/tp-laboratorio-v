package com.utn.tp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.utn.tp.R;
import com.utn.tp.model.Category;

import java.util.List;

/**
 * Created by sebastian.g.ducci on 10/16/2016.
 */
public class CategoryAdapter extends RecyclerView.Adapter<CategoryViewHolder> {

    private List<Category> categories;

    public CategoryAdapter(List<Category> categories){
        this.categories = categories;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item_layout,parent,false);

        CategoryViewHolder viewHolder = new CategoryViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
            Category category = categories.get(position);

            holder.txtName.setText(category.getName());
            holder.txtDesc.setText(category.getDescription());
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
}
