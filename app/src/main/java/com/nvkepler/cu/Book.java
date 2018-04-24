package com.nvkepler.cu;

//    It contains a Book Name and Author Name for a Book.

public class Book {

    private static final int NO_IMAGE_PROVIDED = -1;

    private String mbookName;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Author Name
     */
    private String mauthorName;


    /** Create a new Book object.
     *
     * @param bookName   is the Name of the Book
     * @param authorName is the Author Name
     */
    Book(String bookName, String authorName) {
        mbookName = bookName;
        mauthorName = authorName;
    }

    public Book(String bookName, String authorName, int imageResourceId) {
        mbookName = bookName;
        mauthorName = authorName;
        mImageResourceId = imageResourceId;
    }


    /**
     * Get the Book Name
     */
    public String getBookName() {
        return mbookName;
    }

    /**
     * Get the Author Name
     */
    public String getAuthorName() {
        return mauthorName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}