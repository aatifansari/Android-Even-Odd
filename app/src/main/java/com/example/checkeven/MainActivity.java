package com.example.checkeven;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num;
    Button check;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num=(EditText) findViewById(R.id.n1);
        check=(Button)findViewById(R.id.checkb);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n=Integer.parseInt(num.getText().toString());
                Intent intent=new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("cnum",n);
                startActivity(intent);

            }
        });
    }
}
