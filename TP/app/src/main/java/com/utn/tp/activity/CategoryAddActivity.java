package com.utn.tp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.utn.tp.R;
import com.utn.tp.listener.ClickListener;

public class CategoryAddActivity extends UserAuthenticatedActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_category);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        ClickListener listener = new ClickListener(this);

        Button buttonRegister = (Button) findViewById(R.id.category_add_btn_new);
        buttonRegister.setOnClickListener(listener);

    }
}
