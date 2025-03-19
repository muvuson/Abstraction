import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Book novel = new Book("B-100", "The 48 Laws of Power", LocalDate.now(), "Robert Greene", 208);
        Electronics phone = new Electronics("E-200", "Smartphone", LocalDate.now(), "Samsung", 0.18);

        novel.displayDetails();
        System.out.printf("Total price: $%.2f%n%n", novel.calculatePrice(12.5));

        phone.displayDetails();
        System.out.printf("Total price: $%.2f%n", phone.calculatePrice(199.0));
    }
}