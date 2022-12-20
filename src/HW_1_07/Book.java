package HW_1_07;
import java.util.Objects;
public class Book {
    private final String fullName;
    private final int numberOfPages;
    private int yearOfRelease;
    private Author fullAuthorName;

    public Book(Author fullAuthorName, String fullName, int numberOfPages, int yearOfRelease) {
        this.fullName = fullName;
        this.numberOfPages = numberOfPages;
        this.yearOfRelease = yearOfRelease;
        this.fullAuthorName = fullAuthorName;
    }

    public Author getFullAuthorName() {
        return fullAuthorName;
    }

    public void setFullAuthorName(Author fullAuthorName) {
        this.fullAuthorName = fullAuthorName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages && yearOfRelease == book.yearOfRelease && Objects.equals(fullName, book.fullName) && Objects.equals(fullAuthorName, book.fullAuthorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, numberOfPages, yearOfRelease, fullAuthorName);
    }

    @Override
    public String toString() {
        return "Book: " + fullName + ", количество страниц - " + numberOfPages +
                ", год выпуска - " + yearOfRelease +
                ", ФИО автора - " + fullAuthorName;
    }

    /*    @Override
    public int hashCode() {
        return Objects.hash(fullAuthorName, fullName, numberOfPages, yearOfRelease);
    }

    @Override
    public String toString() {
        return getClass().getName() + " Название книги - " + fullName + ", количество страниц - " + numberOfPages + ", год выпуска - " + yearOfRelease + " , Автор - " + fullAuthorName + ".";
    }

    @Override

    public boolean equals(Object otherObject) {
        //a quick test to see if the objects are identical
        if (this == otherObject)
            return true;

        //must return false if the explicit parameter is null
        if (otherObject == null)
            return false;

        //if classes don't match, they can't be equal
        if (getClass() != otherObject.getClass())
            return false;

        //now we know otherObject is a non-null Employee
        Book other = (Book) otherObject;

        //test whether the fields have identical values
        return Objects.equals(fullAuthorName, other.fullAuthorName) && numberOfPages == other.numberOfPages && Objects.equals(fullName, other.fullName);
    */
}

