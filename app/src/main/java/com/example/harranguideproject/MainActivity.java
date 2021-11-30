package com.example.harranguideproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editPassword;
    private EditText editUser;
    private Object ImageView;
    private Button buttonGiris;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPassword=(EditText) findViewById(R.id.editPassword);
        editUser=(EditText) findViewById(R.id.editUser);
        ImageView=(android.widget.ImageView) findViewById(R.id.imageView);
        Button buttonGiris=(Button)findViewById(R.id.buttonGiris);
        buttonGiris.setOnClickListener(new View.OnClickListener() {
            //sayfalar arasındaki geçişin olacağı kısım
            @Override
            public void onClick(View view) {
                Intent buttonGiris= new Intent(MainActivity.this, MenuActivity.class );
                startActivity(buttonGiris);


            }
        });
    }



}