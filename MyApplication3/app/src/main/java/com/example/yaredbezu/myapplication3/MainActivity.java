package com.example.yaredbezu.myapplication3;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout =new LinearLayout(this);
        TextView lable1 =new TextView(this);
        //TextView lable2=new TextView(this)
        layout.setGravity(Gravity.TOP);
        layout.setOrientation(LinearLayout.VERTICAL);

        //lable1.setWidth(300);
        //lable1.setHeight(300);
         //TextView lable1 =new TextView(this);
         //lable1.setTextSize(14);
         lable1.setBackgroundColor(Color.GREEN);
         lable1.setText("Header");
         EditText input1 =new EditText(this);
         input1.setBackgroundColor(Color.GREEN);
       // input1.setText("Header");
        input1.setInputType(InputType.);
         layout.addView(lable1);
         layout.addView(input1);//input1.setText("Header");
        ///body
        EditText input2 =new EditText(this);
        //lable2.setTextSize(14);
        input2.setBackgroundColor(Color.YELLOW);
        input2.setText("Body");
       // EditText input2 =new EditText(this);
        //input2.setBackgroundColor(Color.YELLOW);
        input2.setInputType(InputType.TYPE_CLASS_TEXT);
        //layout.addView(lable2);
        layout.addView(input2);
        //close
        TextView lable3 =new TextView(this);
        lable3.setTextSize(14);
        lable3.setBackgroundColor(Color.RED);
        lable3.setText("Closing remark");
        EditText input3 =new EditText(this);
        //input3.setBackgroundColor(Color.RED);
        input3.setInputType(InputType.TYPE_CLASS_TEXT);
        layout.addView(lable3);
        layout.addView(input3);
        //layout.addView(input1);

        setContentView(layout);
        LinearLayout.LayoutParams paramsexamples=new LinearLayout.LayoutParams(100,25);
        //lable1.setLayoutParams(paramsexamples);
    }
}
