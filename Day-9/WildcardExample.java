import java.util.ArrayList;
import java.util.List;

class Book {
    String title;
    public Book(String title) {
        this.title = title;
    }
}

class FictionBook extends Book {
    public FictionBook(String title) {
        super(title);
    }
}

class ScienceBook extends Book {
    public ScienceBook(String title) {
        super(title);
    }
}

public class WildcardExample {
    // Upper Bounded Wildcard: Accepts List of Book or its subclasses
    public static void printBooks(List<? extends Book> books) {
        for (Book book : books) {
            System.out.println("Book: " + book.title);
        }
    }

    public static void main(String[] args) {
        List<FictionBook> fictionBooks = new ArrayList<>();
        fictionBooks.add(new FictionBook("Harry Potter"));
        fictionBooks.add(new FictionBook("Lord of the Rings"));

        List<ScienceBook> scienceBooks = new ArrayList<>();
        scienceBooks.add(new ScienceBook("Physics Basics"));
        scienceBooks.add(new ScienceBook("Chemistry Organic"));

        System.out.println("Fiction Books:");
        printBooks(fictionBooks);

        System.out.println("Science Books:");
        printBooks(scienceBooks);
    }
}
