package com.yxkjcx.hrgasapp;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Display display = getWindowManager().getDefaultDisplay(); //Activity#getWindowManager()
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;

        TextView view = (TextView)findViewById(R.id.TextView1);
        view.setText(String.format("x:%d,y:%d",width,height));


    }
}
