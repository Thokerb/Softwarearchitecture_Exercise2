package Model;

public abstract class BookListRepresentation {

    protected String representation;
    private int numBooks;


    public String getRepresentation(){
        return this.representation;
    }

    public int getNumBooks() {
        return numBooks;
    }

    public void setNumBooks(int numBooks) {
        this.numBooks = numBooks;
    }

    public void setRepresentation(String representation) {
        this.representation = representation;
    }

}
