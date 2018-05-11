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
        books.add(new Book("Book Name", "Author Name", R.drawable.bookred, "BarCode"));
        books.add(new Book("Engineering Physics", "Dr. H. K. Malik", R.drawable.bookblue, "1101"));
        books.add(new Book("Engineering Chemistry", "Mr. Rakesh Chauhan", R.drawable.bookred, "1102"));
        books.add(new Book("Engineering Mathematics", "Prof. V. K.", R.drawable.bookblue, "1103"));
        books.add(new Book("Electrical Engineering", "Prof. Shiv Jha", R.drawable.bookred, "1104"));
        books.add(new Book("Chemical Equations", "Dr. Charu Kumar", R.drawable.bookblue, "1105"));
        books.add(new Book("Digital Electronics", "Preeti Sabarwal", R.drawable.bookred, "1106"));
        books.add(new Book("Numerical Methods", "Prof. G. S. Jhamb", R.drawable.bookblue, "1107"));
        books.add(new Book("Discrete Maths", "Prof. R. D. Sharma", R.drawable.bookred, "1108"));
        books.add(new Book("Trapezoidal Equations", "Dr. H. C. Verma", R.drawable.bookblue, "1109"));
        books.add(new Book("Start with Android", "S Chand", R.drawable.bookred, "1110"));


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
