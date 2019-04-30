package com.example.a16866099_5.aplicacionnro3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText edtx;
    private Switch sw;
    private CheckBox chb;
    private final String SALUDO = "Hola a todos desde otro activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.buttonMain);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("saludo", SALUDO);
                startActivity(intent);
            }
        });

        edtx = (EditText) findViewById(R.id.editText);

        edtx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("saludo", SALUDO);
                startActivity(intent);
            }
        });

        sw = (Switch) findViewById(R.id.switchMain);

        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("saludo", SALUDO);
                startActivity(intent);
            }
        });

        chb = (CheckBox) findViewById(R.id.checkBox);

        chb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("saludo", SALUDO);
                startActivity(intent);
            }
        });
    }
}
