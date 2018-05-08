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

    private String mbookCode;

    /**
     * Create a new Book object.
     *
     * @param bookName   is the Name of the Book
     * @param authorName is the Author Name
     */
    Book(String bookName, String authorName, String bookCode) {
        mbookName = bookName;
        mauthorName = authorName;
        mbookCode = bookCode;
    }

    public Book(String bookName, String authorName, int imageResourceId, String bookCode) {
        mbookName = bookName;
        mauthorName = authorName;
        mImageResourceId = imageResourceId;
        mbookCode = bookCode;
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

    public String getBookCode() {
        return mbookCode;
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