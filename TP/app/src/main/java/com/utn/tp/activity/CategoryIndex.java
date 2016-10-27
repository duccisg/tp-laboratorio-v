package com.utn.tp.activity;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import com.utn.tp.R;
import com.utn.tp.adapter.CategoryAdapter;
import com.utn.tp.listener.ClickListener;
import com.utn.tp.model.Category;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class CategoryIndex extends UserAuthenticatedActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_index);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);



        ClickListener listener = new ClickListener(this);

        FloatingActionButton buttonLogin = (FloatingActionButton) findViewById(R.id.category_index_add_button);
        buttonLogin.setOnClickListener(listener);


        List<Category> categories = new ArrayList<Category>();

        categories.add(new Category("Categoria 1" ,"descripcion", Boolean.TRUE,new byte[10]));
        categories.add(new Category("Categoria 2" ,"descripcion", Boolean.TRUE,new byte[10]));
        categories.add(new Category("Categoria 3" ,"descripcion", Boolean.TRUE,new byte[10]));
        categories.add(new Category("Categoria 4" ,"descripcion", Boolean.TRUE,new byte[10]));
        categories.add(new Category("Categoria 5" ,"descripcion", Boolean.TRUE,new byte[10]));
        categories.add(new Category("Categoria 6" ,"descripcion", Boolean.TRUE,new byte[10]));
        categories.add(new Category("Categoria 7" ,"descripcion", Boolean.TRUE,new byte[10]));
        categories.add(new Category("Categoria 8" ,"descripcion", Boolean.TRUE,new byte[10]));
        categories.add(new Category("Categoria 9" ,"descripcion", Boolean.TRUE,new byte[10]));
        categories.add(new Category("Categoria 10" ,"descripcion", Boolean.TRUE,new byte[10]));

        //Populates the recycler view from the activity based on corresponding adapter
        RecyclerView recyclerCategories =(RecyclerView)findViewById(R.id.category_index_list_categories);
        recyclerCategories.setLayoutManager(new LinearLayoutManager(this));
        recyclerCategories.setAdapter(new CategoryAdapter(categories));

    }
}
