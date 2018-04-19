package com.nvkepler.cu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//Created by neha on 22/3/18.

public class FragmentsActivity extends SignInActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragments_activity);

        //*******************************************************************************************

        //Connecting IssueActivity with FragmentsActivity

        // Find the View that shows the IR category
        TextView ir = findViewById(R.id.ir);

        // Set a click listener on that View
        ir.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the IR category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link IssueActivity}
                Intent IRIntent = new Intent(FragmentsActivity.this, IssueActivity.class);

                // Start the new activity
                startActivity(IRIntent);
            }
        });

        //*******************************************************************************************

        //Connecting BooksActivity with FragmentsActivity

        // Find the View that shows the Books category
        TextView book = findViewById(R.id.books);

        // Set a click listener on that View
        book.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the IR category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BooksActivity}
                Intent BooksIntent = new Intent(FragmentsActivity.this, BooksActivity.class);

                // Start the new activity
                startActivity(BooksIntent);
            }
        });

        //*******************************************************************************************

        //Connecting StudentInfoActivity with FragmentsActivity

        // Find the View that shows the Student Info category
        TextView stu = findViewById(R.id.student);

        // Set a click listener on that View
        stu.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the IR category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link StudentInfoActivity}
                Intent StuIntent = new Intent(FragmentsActivity.this, StudentInfoActivity.class);

                // Start the new activity
                startActivity(StuIntent);
            }
        });

        //*******************************************************************************************
    }
}
