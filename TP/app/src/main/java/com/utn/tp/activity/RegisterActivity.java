package com.utn.tp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.utn.tp.R;
import com.utn.tp.listener.ClickListener;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //getSupportActionBar().hide();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);


        ClickListener listener = new ClickListener(this);

        Button buttonRegister = (Button) findViewById(R.id.register_register_btn);
        buttonRegister.setOnClickListener(listener);

    }
}
