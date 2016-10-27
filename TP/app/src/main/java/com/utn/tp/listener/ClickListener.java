package com.utn.tp.listener;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.utn.tp.R;
import com.utn.tp.activity.CategoryAddActivity;
import com.utn.tp.activity.CategoryIndex;
import com.utn.tp.activity.LoginActivity;
import com.utn.tp.activity.RegisterActivity;

/**
 * Created by sebastian.g.ducci on 10/16/2016.
 */
public class ClickListener implements View.OnClickListener {

    private AppCompatActivity activity;

    public ClickListener(AppCompatActivity activity){
        this.activity = activity;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.login_btn_register:

                Intent registerIntent = new Intent(activity, RegisterActivity.class);
                activity.startActivity(registerIntent);
                break;

            case R.id.login_btn_login:

                Intent loginIntent = new Intent(activity, CategoryIndex.class);
                activity.startActivity(loginIntent);
                break;

            case R.id.category_index_add_button:

                Intent addCategory = new Intent(activity, CategoryAddActivity.class);
                activity.startActivity(addCategory);
                break;

            case R.id.category_add_btn_new:

                Intent newCategory = new Intent(activity, CategoryIndex.class);
                activity.startActivity(newCategory);
                break;


            case R.id.register_register_btn:

                Intent login = new Intent(activity, LoginActivity.class);
                activity.startActivity(login);
                break;

            default:

                break;
        }


    }
}
