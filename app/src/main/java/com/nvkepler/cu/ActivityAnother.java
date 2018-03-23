package com.nvkepler.cu;

//Created by neelv on 23/3/18.

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class ActivityAnother extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another_activity);
        Log.d("Open", "ActivityAnother is opened");
    }

    //Connecting SecondActivity with ActivityAnother
    public void SignIn(View v) {
        if (v.getId() == R.id.next) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
    }

}
