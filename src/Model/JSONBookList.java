package Model;

import java.util.List;

public class JSONBookList extends BookListRepresentation{
    public JSONBookList(List<Book> books){
        setNumBooks(books.size());
    }
}
