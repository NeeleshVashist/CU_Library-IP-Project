package com.nvkepler.cu;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

//Created by neelv on 22/3/18.

public class BooksSignInActivity extends FragmentsSignInActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.books_activity);

        // Create a list of books
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("one", "abc"));
        books.add(new Book("two", "xyz"));
        books.add(new Book("three", "abc"));
        books.add(new Book("four", "xyz"));
        books.add(new Book("five", "abc"));
        books.add(new Book("six", "xyz"));
        books.add(new Book("seven", "abc"));
        books.add(new Book("eight", "xyz"));
        books.add(new Book("nine", "abc"));
        books.add(new Book("ten", "xyz"));


        BookAdapter adapter = new BookAdapter(this, books);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
