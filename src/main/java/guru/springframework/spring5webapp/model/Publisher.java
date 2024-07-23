package guru.springframework.spring5webapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;

import java.util.Set;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String contact;
    private String phone;

    @ManyToMany(mappedBy = "publishers")
    private Set<Book> books = new HashSet<>();

    public Publisher() {

    }

    public Publisher(Long id, String name, String contact, String phone) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.phone = phone;
    }

    public Publisher(Long id, String name, String contact, String phone, Set<Book> books) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.phone = phone;
        this.books = books;

    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

}
