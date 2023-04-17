package Task2;

public class Task2Main {
    public static void main(String[] args) {

        Bookshelf bookshelf = new Bookshelf();

        Books book1 = new Books("Needful Things", 74289503095890L, "Stephen King");
        Books book2 = new Books("Foggy Mountain Breakdown", 74839000494090L, "Sharyn McCrumb");
        Books book3 = new Books("The Testament", 76909983342792L, "John Grisham");

        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);

        System.out.println(bookshelf.containsBook("Needful Things"));
        System.out.println(bookshelf.containsBook(76909983342792L));
        System.out.println(bookshelf.containsBook("Close"));


        bookshelf.printBookshelf();
    }
}
