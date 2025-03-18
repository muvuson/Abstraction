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
