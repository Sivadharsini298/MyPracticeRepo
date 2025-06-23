import java.util.*;

public class Main {

    // Linear Search
    public static Book linearSearchByTitle(List<Book> books, String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary Search (Assumes books are sorted by title)
    public static Book binarySearchByTitle(List<Book> books, String title) {
        int low = 0, high = books.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = books.get(mid).title.compareToIgnoreCase(title);
            if (comparison == 0)
                return books.get(mid);
            else if (comparison < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Alchemist", "Paulo Coelho"));
        books.add(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book(3, "1984", "George Orwell"));
        books.add(new Book(4, "Pride and Prejudice", "Jane Austen"));
        books.add(new Book(5, "Moby Dick", "Herman Melville"));

        // Sort list for binary search
        books.sort(Comparator.comparing(b -> b.title));

        String searchTitle = "1984";

        System.out.println("Linear Search:");
        Book found1 = linearSearchByTitle(books, searchTitle);
        printResult(found1);

        System.out.println("Binary Search:");
        Book found2 = binarySearchByTitle(books, searchTitle);
        printResult(found2);
    }

    static void printResult(Book book) {
        if (book != null)
            System.out.println("Found: " + book.title + " by " + book.author);
        else
            System.out.println("Book not found.");
    }
}
