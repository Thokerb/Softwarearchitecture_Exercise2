package Test;

import Api.Client;
import Model.Book;
import Model.ListType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    private List<Book> books;
    private Client client;
    @BeforeEach
    private void initTest(){
        books = new ArrayList<Book>();
        books.add(new Book("Robert C. Martin","Clean Code",2008));
        books.add(new Book("Christian Ullenboom","Java ist auch eine Insel, Version 11",2018));
        books.add(new Book("Erich Gamma, Richard Helm, Ralph E. Johnson,John Vlissides","Design Patterns",1994));
        client = new Client();
    }

    @Test
    void getBookListRepresentationJSON() {

        var jsonRepresentation = client.getBookListRepresentation(books, ListType.JSON);
        var jsonStringExpected = "";
        String file = "src/Test/example.json";
        try {
            jsonStringExpected = readFileAsString(file);
        } catch (Exception e) {
            fail();
        }
        assertEquals(books.size(),jsonRepresentation.getNumBooks());
        assertEquals(jsonStringExpected,jsonRepresentation.getRepresentation());
    }

    private static String readFileAsString(String file)throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    @Test
    void getBookListRepresentationHTML() {
        var htmlRepresentation = client.getBookListRepresentation(books, ListType.HTML);
        var htmlStringExpected = "";
        String file = "src/Test/example.html";
        try {
            htmlStringExpected = readFileAsString(file);
        } catch (Exception e) {
            fail();
        }
        assertEquals(books.size(),htmlRepresentation.getNumBooks());
        assertEquals(htmlStringExpected,htmlRepresentation.getRepresentation());
    }
}