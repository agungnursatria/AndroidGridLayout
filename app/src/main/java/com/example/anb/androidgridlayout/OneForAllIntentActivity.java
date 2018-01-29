package com.example.anb.androidgridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OneForAllIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_for_all_intent);

        TextView txtInfo = (TextView) findViewById(R.id.txtInfo);
        if (getIntent() != null){
            String info = getIntent().getStringExtra("info");
            txtInfo.setText(info);
        }
    }
}
