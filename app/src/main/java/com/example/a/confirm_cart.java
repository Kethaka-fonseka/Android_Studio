package com.example.a;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

public class confirm_cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_cart);
        getSupportActionBar().hide();

    }


    public void dialogBox(View view){
        Dialog dialog=new Dialog(this);
        dialog.setContentView(R.layout.add_to_cart_dialog);
        dialog.setTitle("Alert");

        dialog.show();

    }
}