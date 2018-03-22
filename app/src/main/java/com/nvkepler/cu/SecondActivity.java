package com.nvkepler.cu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by neha on 22/3/18.
 */

public class SecondActivity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_second);

        //*******************************************************************************************

        // Find the View that shows the IR category
        TextView ir = (TextView) findViewById(R.id.ir);

        // Set a click listener on that View
        ir.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the IR category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link IRActivity}
                Intent IRIntent = new Intent(SecondActivity.this, IRActivity.class);

                // Start the new activity
                startActivity(IRIntent);
            }
        });

        //*******************************************************************************************

        // Find the View that shows the Books category
        TextView book = (TextView) findViewById(R.id.books);

        // Set a click listener on that View
        book.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the IR category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BooksActivity}
                Intent BooksIntent = new Intent(SecondActivity.this, BooksActivity.class);

                // Start the new activity
                startActivity(BooksIntent);
            }
        });

        //*******************************************************************************************

        // Find the View that shows the Student Info category
        TextView stu = (TextView) findViewById(R.id.student);

        // Set a click listener on that View
        stu.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the IR category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link StudentActivity}
                Intent StuIntent = new Intent(SecondActivity.this, StudentActivity.class);

                // Start the new activity
                startActivity(StuIntent);
            }
        });

        //*******************************************************************************************
    }
}
