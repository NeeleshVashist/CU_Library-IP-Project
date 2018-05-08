package com.nvkepler.cu;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

//Created by neelv on 22/3/18.

public class IssueActivity extends FragmentsActivity {


    int clickcount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.issue_activity);
    }

    public void submit(View v) {

        EditText mcode = (EditText) findViewById(R.id.code);
        String scode = mcode.getText().toString();
        if (TextUtils.isEmpty(scode)) {
            mcode.setError("Please Enter the BarCode Number");
            return;
        }

        clickcount++;

        if (clickcount > 4) {
            Toast.makeText(IssueActivity.this, "Maximum Number of Books already issued", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(IssueActivity.this, "Book Registered", Toast.LENGTH_SHORT).show();
            mcode.setText("");
        }
    }

}