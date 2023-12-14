package com.example.task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btn(View view)
    {
        TextView txtHello = findViewById(R.id.textView2);
        EditText editName = findViewById(R.id.editTextText);
        txtHello.setText("Hello " + editName.getText().toString() + "!");
        TextView textView2 = findViewById(R.id.textView3);
        EditText editName1 = findViewById(R.id.editTextText);
        textView2.setText("Name: " + editName1.getText().toString());
        TextView textView =findViewById(R.id.textView5);
        EditText editRegister= findViewById(R.id.editTextText4);
        textView.setText("Register: " + editRegister.getText().toString());
        TextView textView1 = findViewById(R.id.textView);
        EditText editCollege= findViewById(R.id.editTextText2);
        textView1.setText("College: " + editCollege.getText().toString());
    }
}