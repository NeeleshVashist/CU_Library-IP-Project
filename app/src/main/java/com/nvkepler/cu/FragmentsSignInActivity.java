package com.nvkepler.cu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//Created by neha on 22/3/18.

public class FragmentsSignInActivity extends SignInActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragments_activity);

        //*******************************************************************************************

        //Connecting IssueSignInActivity with FragmentsSignInActivity

        // Find the View that shows the IR category
        TextView ir = findViewById(R.id.ir);

        // Set a click listener on that View
        ir.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the IR category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link IssueSignInActivity}
                Intent IRIntent = new Intent(FragmentsSignInActivity.this, IssueSignInActivity.class);

                // Start the new activity
                startActivity(IRIntent);
            }
        });

        //*******************************************************************************************

        //Connecting BooksSignInActivity with FragmentsSignInActivity

        // Find the View that shows the Books category
        TextView book = findViewById(R.id.books);

        // Set a click listener on that View
        book.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the IR category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BooksSignInActivity}
                Intent BooksIntent = new Intent(FragmentsSignInActivity.this, BooksSignInActivity.class);

                // Start the new activity
                startActivity(BooksIntent);
            }
        });

        //*******************************************************************************************

        //Connecting StudentInfoActivity with FragmentsSignInActivity

        // Find the View that shows the Student Info category
        TextView stu = findViewById(R.id.student);

        // Set a click listener on that View
        stu.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the IR category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link StudentInfoActivity}
                Intent StuIntent = new Intent(FragmentsSignInActivity.this, StudentInfoActivity.class);

                // Start the new activity
                startActivity(StuIntent);
            }
        });

        //*******************************************************************************************
    }
}
