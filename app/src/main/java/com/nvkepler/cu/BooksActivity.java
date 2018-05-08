package com.nvkepler.cu;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

//Created by neelv on 22/3/18.

public class BooksActivity extends FragmentsActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.books_activity);

        // Create a list of books
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Book Name", "Author Name", R.drawable.bookred, "Book BarCode"));
        books.add(new Book("Book 1", "abc", R.drawable.bookblue, "0001"));
        books.add(new Book("Book 2", "xyz", R.drawable.bookred, "0002"));
        books.add(new Book("Book 3", "abc", R.drawable.bookblue, "0003"));
        books.add(new Book("Book 4", "xyz", R.drawable.bookred, "0004"));
        books.add(new Book("Book 5", "abc", R.drawable.bookblue, "0005"));
        books.add(new Book("Book 6", "xyz", R.drawable.bookred, "0006"));
        books.add(new Book("Book 7", "abc", R.drawable.bookblue, "0007"));
        books.add(new Book("Book 8", "xyz", R.drawable.bookred, "0008"));
        books.add(new Book("Book 9", "abc", R.drawable.bookblue, "0009"));
        books.add(new Book("Book 10", "xyz", R.drawable.bookred, "0010"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        BookAdapter adapter = new BookAdapter(this, books);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
