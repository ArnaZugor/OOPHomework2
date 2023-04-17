package Task2;

public class Books {
    private String title;
    private long ISBN;
    private String author;

    public Books(final String title, final long ISBN, final String author){
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
    }

    public String getTitle(){
        return this.title;
    }

    public long getISBN(){
        return this.ISBN;
    }

    public String getAuthor(){
        return this.author;
    }

    @Override
    public String toString(){
        return this.title + ", " + this.author + " ISBN: " + this.ISBN ;
    }
}

