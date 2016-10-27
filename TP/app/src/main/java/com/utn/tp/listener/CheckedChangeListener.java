package com.utn.tp.listener;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;

import com.utn.tp.R;

/**
 * Created by sebastian.g.ducci on 10/17/2016.
 */
public class CheckedChangeListener implements CompoundButton.OnCheckedChangeListener {

    private AppCompatActivity activity;

    public CheckedChangeListener(AppCompatActivity activity){
        this.activity = activity;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        switch (buttonView.getId()){
            case R.id.login_btn_remember :

                SharedPreferences prefs = activity.getSharedPreferences("config" , Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putBoolean("rembember_user", isChecked);
                editor.commit();



            break;
        }


    }
}
