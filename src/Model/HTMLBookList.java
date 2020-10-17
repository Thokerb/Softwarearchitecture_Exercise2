package Model;

import java.util.List;

public class HTMLBookList extends BookListRepresentation{
    public HTMLBookList(List<Book> books) {
        setNumBooks(books.size());
    }

}
