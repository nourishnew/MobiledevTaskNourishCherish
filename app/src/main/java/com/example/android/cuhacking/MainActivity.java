package com.example.android.cuhacking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int value=0;
    private Toast mToast = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView num =(TextView)findViewById(R.id.number);
        Button increment=(Button) findViewById(R.id.incr);
        final Button decrement=(Button)findViewById(R.id.decr);
        num.setText(Integer.toString(value));
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                increment(num);


            }
        });

        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decrement(num);


            }
        });


    }


    public int getCurrentNumber(){

        return value;

    }

    public void increment(TextView t){

        value++;
        t.setText(Integer.toString(getCurrentNumber()));


    }
    public void decrement(TextView t){
        if (mToast != null) mToast.cancel();
        value--;

        t.setText(Integer.toString(getCurrentNumber()));
    }










}



