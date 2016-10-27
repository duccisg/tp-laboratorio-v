package com.utn.tp.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

import com.utn.tp.R;
import com.utn.tp.controller.UserController;
import com.utn.tp.listener.CheckedChangeListener;
import com.utn.tp.listener.ClickListener;

public class LoginActivity extends AppCompatActivity {

    private UserController userController = UserController.getUserController();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ActionBar bar =  getSupportActionBar();
        bar.setDisplayHomeAsUpEnabled(false);
        //getSupportActionBar().hide();
        getSupportActionBar().setHomeButtonEnabled(false);

        ClickListener listener = new ClickListener(this);

        Button buttonRegister = (Button) findViewById(R.id.login_btn_register);
        buttonRegister.setOnClickListener(listener);

        Button buttonLogin = (Button) findViewById(R.id.login_btn_login);
        buttonLogin.setOnClickListener(listener);

        CheckBox checkBox = (CheckBox) findViewById(R.id.login_btn_remember);
        checkBox.setOnCheckedChangeListener(new CheckedChangeListener(this));

        //user's remember option to be considered before showing the activity
        SharedPreferences prefs = this.getSharedPreferences("config" , Context.MODE_PRIVATE);
        Boolean rememberUser = prefs.getBoolean("rembember_user",Boolean.FALSE);

        ((CheckBox) findViewById(R.id.login_btn_remember)).setChecked(rememberUser);

        if(rememberUser){
            Intent loginIntent = new Intent(this, CategoryIndex.class);
            this.startActivity(loginIntent);
        }


    }
}
