package com.example.librarynew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MyLibraryActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText1, editText2, editText3;
    private Button add, sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_library);

        editText1 = findViewById(R.id.number1);
        editText2 = findViewById(R.id.number2);
        editText3 = findViewById(R.id.result);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);

    }

    public static void s (Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View view) {
        try {
            String num1 = editText1.getText().toString();
            String num2 = editText2.getText().toString();
            double i = Double.parseDouble(num1);
            double j = Double.parseDouble(num2);
            int id = view.getId();
            if (id == R.id.add) {

                editText3.setText("Add=" + (i + j));
            } else if (id == R.id.sub) {
                editText3.setText("Sub=" + (i - j));
            }

        } catch (Exception e) {

        }
    }

}