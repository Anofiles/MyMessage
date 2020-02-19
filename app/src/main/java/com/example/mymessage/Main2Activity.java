package com.example.mymessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    public static final String EXTRA_MASSAGE="massage text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i=getIntent();
        String massage=i.getStringExtra(EXTRA_MASSAGE);
        TextView textView=(TextView)findViewById(R.id.textMessage);
        textView.setText(massage);
    }
}
