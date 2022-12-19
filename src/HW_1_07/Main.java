package HW_1_07;

public class Main {
    public static void main(String[] args) {
        Book author1 = new Book("Leo Tolstoy", "War and piece",1300,1867);
        Book author2 = new Book("Joanne Harris", "Blackberry Wine", 414, 2001);
        author2.setYearOfRelease (2002);
        System.out.println("Book 1: " + author1.getAuthorName() + ", " + author1.getFullName() + ", " + author1.getNumberOfPages() + " pages, " + author1.getYearOfRelease() + " year.");
        System.out.println("Book 2: " + author2.getAuthorName() + ", " + author2.getFullName() + ", " + author2.getNumberOfPages() + " pages, " + author2.getYearOfRelease() + " year.");
        System.out.println("author1.equals(author2): " + author1.equals(author2));
        System.out.println("author1.toString: " + author1);
        System.out.println("author1.hashCode(): " + author1.hashCode());
        System.out.println("author2.toString: " + author2);
        System.out.println("author2.hashCode(): " + author2.hashCode());
    }
}