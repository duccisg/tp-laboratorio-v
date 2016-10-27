package com.utn.tp.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.utn.tp.R;

/**
 * Created by sebastian.g.ducci on 10/17/2016.
 */
public class UserAuthenticatedActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_item, menu);

        ActionBar bar =  getSupportActionBar();
        bar.setDisplayHomeAsUpEnabled(true);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_close_session:
                SharedPreferences prefs = this.getSharedPreferences("config" , Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putBoolean("rembember_user", Boolean.FALSE);
                editor.commit();

                Intent login = new Intent(this, LoginActivity.class);
                this.startActivity(login);
            break;
            case R.id.menu_categories:

            break;
            case R.id.menu_favorites:

            break;
        }

        return super.onOptionsItemSelected(item);
    }

}


