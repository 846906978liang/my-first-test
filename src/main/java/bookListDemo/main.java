package bookListDemo;

import bookListDemo.entity.Author;
import bookListDemo.entity.Book;

/**
 * @author hl
 * @version 1.0
 * @date 2019/9/27 18:20
 */
public class main {

    public static void main(String[] args) {

        Book book =new Book("springboot", new Author("dax",20) );
        System.out.println(book.toString());
    }
}
