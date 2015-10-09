package com.example.nikitagamolsky.androidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        if (savedInstanceState==null){
            String joke = getIntent().getStringExtra("joke");
            TextView joketextview = (TextView) findViewById(R.id.joketextview);
            joketextview.setText(joke);
        }
    }
}



