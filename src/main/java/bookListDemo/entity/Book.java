package bookListDemo.entity;


import javax.persistence.Entity;

/**
 * @author hl
 * @version 1.0
 * @date 2019/9/27 18:20
 */
@Entity
public class Book {
private String name;
private Author author;

    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("name='").append(name).append('\'');
        sb.append(", author=").append(author);
        sb.append('}');
        return sb.toString();
    }
}
