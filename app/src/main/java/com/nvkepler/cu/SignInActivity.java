package com.nvkepler.cu;

//Created by neelv on 23/3/18.

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_activity);
    }

    //Connecting FragmentsActivity with SignInActivity
    public void SignIn(View v) {
        if (v.getId() == R.id.signin) {
            Intent intent = new Intent(this, IssueActivity.class);
            startActivity(intent);
        }
    }

}
