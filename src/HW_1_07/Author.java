package HW_1_07;

public class Author {
    private final String fullAuthorName;
    public Author (String fullAuthorName) {
        this.fullAuthorName = fullAuthorName;
    }
    @Override
    public String toString() {
        return  fullAuthorName;
    }
    /*public boolean equals(Object otherObject)
    {
        if(!super.equals(otherObject))
            return false;
        Author other = (Author) otherObject;
        return fullAuthorName == other.fullAuthorName;
    }

    public int hashCode()
    {
        return hashCode();
    } */
}