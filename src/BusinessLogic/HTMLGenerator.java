package BusinessLogic;

import Model.Book;
import Model.BookListRepresentation;
import Model.HTMLBookList;

import java.util.List;

public class HTMLGenerator implements RepresentationGenerator {


    @Override
    public BookListRepresentation generateBookListRepresentation(List<Book> books) {
        var builder = new StringBuilder();
        builder.append("<ul>\r\n");
        int counter = 0;
        for (var book:books) {
            builder.append(ToHTMLListElement("\t",book));
            builder.append("\r\n");
        }
        builder.append("</ul>\r\n");
        var response = new HTMLBookList(books);
        response.setRepresentation(builder.toString());
        return response;
    }


    private String ToHTMLListElement(String preTab,Book book){
        return preTab+"<li> "+book.getTitle()+"; by "+book.getAuthor()+"; published: "+book.getYearPublished()+" </li>";
    }
}
