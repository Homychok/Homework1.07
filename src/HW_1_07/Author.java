package HW_1_07;

public class Author {
    private String authorName;
    public Author(String authorName) {this.authorName = authorName;}
    public boolean equals(Object otherObject)
    {
        if(!super.equals(otherObject))
            return false;
        Author other = (Author) otherObject;
        return authorName == other.authorName;
    }

    public int hashCode()
    {
        return hashCode();
    }

    public String toString()
    {
        return super.toString() + "authorName" + authorName + ".";
    }

}