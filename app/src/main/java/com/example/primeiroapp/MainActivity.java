package com.example.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textNome;
    Button btnProcessar;
    EditText editNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textNome = (TextView)  findViewById(R.id.textNome);
        btnProcessar = (Button) findViewById(R.id.btnProcessar);
        editNome = (EditText) findViewById(R.id.editNome);
    }
        public void clickNoBotao(View view){
            textNome.setText("Seja bem vindo:" +editNome.getText());

    }
}