package HW_1_07;
import java.util.Objects;
public class Book {
    private String fullName;
    private int numberOfPages;
    private int yearOfRelease;
    private String authorName;

    public Book(String authorName, String fullName, int numberOfPages, int yearOfRelease) {
        this.fullName = fullName;
        this.numberOfPages = numberOfPages;
        this.yearOfRelease = yearOfRelease;
        this.authorName = authorName;
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

    public String getAuthorName() {
        return authorName;
    }
    public void setYearOfRelease ( int yearOfRelease){
        this.yearOfRelease = yearOfRelease;
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(authorName, fullName, numberOfPages, yearOfRelease);
    }
    @Override
    public String toString()
    {
        return getClass().getName() + " Название книги - " + fullName  + ", количество страниц - " + numberOfPages + ", год выпуска - " + yearOfRelease + " , Автор - " + authorName + ".";
    }
    @Override

    public boolean equals(Object otherObject)
    {
        //a quick test to see if the objects are identical
        if(this == otherObject)
            return true;

        //must return false if the explicit parameter is null
        if(otherObject == null)
            return false;

        //if classes don't match, they can't be equal
        if(getClass() != otherObject.getClass())
            return false;

        //now we know otherObject is a non-null Employee
        Book other = (Book) otherObject;

        //test whether the fields have identical values
        return Objects.equals(authorName, other.authorName) && numberOfPages == other.numberOfPages && Objects.equals(fullName, other.fullName);
    }

}
