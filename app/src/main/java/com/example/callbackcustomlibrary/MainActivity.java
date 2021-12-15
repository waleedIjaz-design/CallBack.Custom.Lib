package com.example.callbackcustomlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.librarynew.MyLibraryActivity;

public class MainActivity extends AppCompatActivity implements MyLibraryActivity.GetData,View.OnClickListener {

    EditText editText1, editText2, editText3;
    private Button add, sub;

    MyLibraryActivity.GetData getData = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.number1);
        editText2 = findViewById(R.id.number2);
        editText3 = findViewById(R.id.result);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);

    }


    @Override
    public int val(int result) {
        Toast.makeText(this, "Answer is " + result, Toast.LENGTH_SHORT).show();
        return 0;
    }

    @Override
    public void onClick(View view) {
        try {
            String num1 = editText1.getText().toString();
            String num2 = editText2.getText().toString();
            int i = Integer.parseInt(num1);
            int j = Integer.parseInt(num2);
            int id = view.getId();
            if (id == R.id.add) {

                editText3.setText("Add=" + (i + j));
                MyLibraryActivity.addition(getData, i,j);

            } else if (id == R.id.sub) {
                editText3.setText("Sub=" + (i - j));
                MyLibraryActivity.subtraction(getData,i,j);
            }

        } catch (Exception e) {

        }

    }
}