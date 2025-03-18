import java.time.LocalDate;

abstract class GameObject {
    String id;
    String name;
    LocalDate created;

    public GameObject(String id, String name, LocalDate created) {
        this.id = id;
        this.name = name;
        this.created = created;
    }

    abstract void displayDetails();

    double calculatePrice(double base) {
        return base * 1.15;
    }
}
class Book extends GameObject {
    String author;
    int pages;

    public Book(String id, String name, LocalDate created, String author, int pages) {
        super(id, name, created);
        this.author = author;
        this.pages = pages;
    }
    void displayDetails() {
        System.out.println("Book: " + name);
        System.out.println("ID: " + id);
        System.out.println("By " + author);
        System.out.println(pages + " pages");
        System.out.println("Added on " + created);
    }
    double calculatePrice(double base) {
        return super.calculatePrice(base) + (pages * 0.03);
    }
}
