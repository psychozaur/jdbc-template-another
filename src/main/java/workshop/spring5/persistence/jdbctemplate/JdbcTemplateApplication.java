package workshop.spring5.persistence.jdbctemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import workshop.spring5.persistence.jdbctemplate.config.MainConfig;
import workshop.spring5.persistence.jdbctemplate.dao.BookRepository;
import workshop.spring5.persistence.jdbctemplate.model.Book;

public class JdbcTemplateApplication {

    public static void main(String[] args) {
        /*
            TODO 4 Wydrukuj do konsoli Book, używająć bookRepository wyszukanego w kontekście Spring'a
                                                utwórz ApplicationContext używając MainConfig
                                                wyszukaj w kontekście bookRepository i wywołaj na nim metodę getBook
                                                wydrukuj do konsoli wartośc zwracaną przez getBook
          */

        final Logger logger = LoggerFactory.getLogger(JdbcTemplateApplication.class);

        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        Book book = context.getBean(BookRepository.class).getBook(1);

        logger.debug("main(): " + book.toString());

        /*
            TODO 10 wywołanie metody dao, zwracającej String
                wywołaj metodę getBookNameById i wypisz zwracaną wartość do konsoli

          */



        /*

            TODO 13 wywołanie metody dao, zwracającej obiekt Book
                wywołaj metodę getBookById i wypisz zwracaną wartość do konsoli
         */

        /*

            TODO 15 wywołanie metody dao, zwracającej ilość rekordów w tabeli
                Wywołaj metodę getSize i wypisz zwracaną wartość do konsoli
         */

        /*

            TODO 17 wywołanie metody dao, tworzącej nowy rekord w tabeli
                Pobierz rozmiar tabeli i wydrukuj do konsoli
                Utwórz obiekt Book (id = rozmiar tabeli + 1).
                Wywołaj metodę dao insertBook.
                Wywołaj metodę getSize i wypisz zwracaną wartość do konsoli
         */

        /*

            TODO 21 wywołanie metody dao, wyszukującej rekord po tytule i autorze
                Wywołaj metodę getByTitleAndAuthor i wypisz zwracaną wartość do konsoli
         */
    }

}
