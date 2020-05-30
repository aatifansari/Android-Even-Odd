package com.example.checkeven;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends Activity {
    int num;
    TextView tv;

    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity2);
        tv=(TextView)findViewById(R.id.text2);

        Intent intent=getIntent();
        num=intent.getIntExtra("cnum",0);
        String str=check(num);
        tv.setText(str);



    }
    public String check(int num){
        if(num%2==0){
            return ("Even");

        }
        else{
            return("odd");
        }
    }
}
