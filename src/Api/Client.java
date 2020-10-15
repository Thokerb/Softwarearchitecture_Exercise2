package Api;

import BusinessLogic.HTMLGenerator;
import BusinessLogic.JSONGenerator;
import BusinessLogic.RepresentationGenerator;
import Model.Book;
import Model.BookListRepresentation;
import Model.ListType;

import java.util.List;

public class Client {

    private RepresentationGenerator HTMLGenerator;
    private RepresentationGenerator JSONGenerator;

    public Client() {
        this.HTMLGenerator = new HTMLGenerator();
        this.JSONGenerator = new JSONGenerator();
    }

    public BookListRepresentation getBookListRepresentation(List<Book> books, ListType type){
        switch (type){

            case HTML:
                return HTMLGenerator.generateBookListRepresentation(books);
            case JSON:
                return JSONGenerator.generateBookListRepresentation(books);
            default:
                throw new IllegalArgumentException("Type: "+type+" is not a known ListType");
        }

    }
}
