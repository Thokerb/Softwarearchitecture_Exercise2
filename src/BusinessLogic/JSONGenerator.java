package BusinessLogic;

import Model.Book;
import Model.BookListRepresentation;

import java.util.List;

public class JSONGenerator implements RepresentationGenerator {
    @Override
    public BookListRepresentation generateBookListRepresentation(List<Book> books) {
        var builder = new StringBuilder();
        builder.append("{\r\n");
        builder.append("\t\"Books\": ");
        builder.append("[\r\n");
        int counter = 0;
        for (var book:books) {
            builder.append(ToJson("\t\t",book));
            if(++counter != books.size()){
                builder.append(",");
            }
            builder.append("\r\n");
        }
        builder.append("\t]\r\n");
        builder.append("}\r\n");
        return new BookListRepresentation(builder.toString(),books.size());
    }

    private String ToJson(String preTab, Book book){
        return
                preTab+"{\r\n" +
                        preTab+"\t\"author\":\""+book.getAuthor()+" \",\r\n" +
                        preTab+"\t\"title\":\""+book.getTitle()+" \",\r\n" +
                        preTab+"\t\"year\":\""+book.getYearPublished()+" \"\r\n"+
                        preTab+"}";
    }
}
