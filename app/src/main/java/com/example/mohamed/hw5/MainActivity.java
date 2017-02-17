package com.example.mohamed.hw5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    RadioButton[] radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        radioButton = new RadioButton[3];
        LinearLayout ll = new LinearLayout(this);
        ScrollView sv = (ScrollView) findViewById(R.id.scroll);
        ll.setOrientation(LinearLayout.VERTICAL);
        sv.removeAllViews();
        for (int i = 0; i < 3; i++){
            radioButton[i] = new RadioButton(this);
            radioButton[i].setText("FF");
            ll.addView(radioButton[i]);
        }
        sv.addView(ll);






    }
}
