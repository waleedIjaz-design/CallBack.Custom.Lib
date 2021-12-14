package com.example.librarynew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MyLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_library);


    }

    public static void s (Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }



//    public  static void sum(GetData getData,int a , int b){
//
//        GetData getData1 = getData;
//
//        getData.val(a+b);
//
//    }

    public static  void addition(GetData getData, int a, int b){

        GetData getData2 = getData;

        getData.val(a+b);

    }

    public static  void subtraction(GetData getData, int a, int b){

        GetData getData2 = getData;

        getData.val(a-b);

    }



    //Created Interface

    public interface GetData
    {
        int val(int result);
    }

}