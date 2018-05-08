package com.nvkepler.cu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
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

        TextView booksName = listItemView.findViewById(R.id.book_text_view);

        assert currentBook != null;
        booksName.setText(currentBook.getBookName());

        TextView authorName = listItemView.findViewById(R.id.author_text_view);

        authorName.setText(currentBook.getAuthorName());

        TextView bookCode = listItemView.findViewById(R.id.book_code);

        bookCode.setText(currentBook.getBookCode());


        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentBook.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentBook.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
