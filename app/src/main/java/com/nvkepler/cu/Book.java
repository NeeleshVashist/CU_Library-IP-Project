package com.nvkepler.cu;

//    It contains a Book Name and Author Name for a Book.

public class Book {

    /**
     * Book Name
     */
    private String mbookName;

    /**
     * Author Name
     */
    private String mauthorName;

    /**
     * Create a new Book object.
     *
     * @param bookName   is the Name of the Book
     * @param authorName is the Author Name
     */
    Book(String bookName, String authorName) {
        mbookName = bookName;
        mauthorName = authorName;
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

}