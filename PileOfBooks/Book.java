// The Book class stores the book title and numberOfPages
// used for PileOfBooks assignment due 9/22/21
public class Book {
    
    // instance variables
    private String title;
    private String author;
    private int year;

    public Book(String t, String a, int y) {
        title = t;
        author = a;
        year = y;
    }

    // set methods
    public void setTitle(String t) {
        title = t;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void setyear(int y) {
        year = y;
    }

    public void set(String t, String a, int y) {
        title = t;
        author = a;
        year = y;
    }

    // get methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean equals(Book b) {
        if ((this.title).equals(b.title)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return ("Title: " + title + " Author: " + author + " Year: " + year);
    }

}