package com.example.labo2;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button boton;
    private EditText edit;
    private EditText edit2;
    private TextView text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        boton = findViewById(R.id.btn);
        edit = findViewById(R.id.user);
        edit2 = findViewById(R.id.pass);
        text = findViewById(R.id.text);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(edit.getText());
                Toast.makeText(getApplicationContext(),"clicked",Toast.LENGTH_LONG).show();
            }


        });

        boton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                text.setText(edit2.getText());
                Toast.makeText(getApplicationContext(),"LongClicked",Toast.LENGTH_LONG).show();

                return false;
            }
        });



       /* button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(edit.getText());
            }

            @Override
            public boolean onLongClick(View v) {
                text.setText(edit2.getText());
                return false;
            }
        });*/
    }

}