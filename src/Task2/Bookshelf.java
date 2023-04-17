package Task2;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {

    private List<Books> bookList;

    public Bookshelf(){
        this.bookList = new ArrayList<>();
    }

    public void addBook(final Books book){
        this.bookList.add(book);
    }

    public boolean containsBook(final String title){
        for(final Books book : this.bookList){
            if(book.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }

    public boolean containsBook(final long ISBN){
        for(final Books book : this.bookList){
            if(book.getISBN() == ISBN){
                return true;
            }
        }
        return false;
    }

    public void printBookshelf(){
        for (final Books book : this.bookList){
            System.out.println(book);
        }
    }
}


