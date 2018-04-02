package com.nvkepler.cu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class BookAdapter extends ArrayAdapter<Book> {

    BookAdapter(Context context, ArrayList<Book> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Book} object located at this position in the list
        Book currentBook = getItem(position);

        TextView miwokTextView = listItemView.findViewById(R.id.books_name);

        assert currentBook != null;
        miwokTextView.setText(currentBook.getBookName());

        TextView defaultTextView = listItemView.findViewById(R.id.author_name);

        defaultTextView.setText(currentBook.getAuthorName());

        return listItemView;
    }
}
