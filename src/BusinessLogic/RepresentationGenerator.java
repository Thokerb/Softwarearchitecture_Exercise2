package BusinessLogic;

import Model.Book;
import Model.BookListRepresentation;

import java.util.List;

public interface RepresentationGenerator {
    public BookListRepresentation generateBookListRepresentation(List<Book> books);
}
