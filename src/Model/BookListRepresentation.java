package Model;

public class BookListRepresentation {
    protected String representation;
    private int numBooks;

    public BookListRepresentation(String representation, int numBooks) {
        this.representation = representation;
        this.numBooks = numBooks;
    }

    public String getRepresentation(){
        return this.representation;
    }

    public int getNumBooks() {
        return numBooks;
    }
}
