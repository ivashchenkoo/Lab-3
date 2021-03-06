import java.io.Serializable;

public class Room implements Serializable {
    // Оголошення змінних для збереження даних про номер
    private final int number;
    private final String description;
    private final int seats;
    private final int price;
    private boolean available;
    private String dateOfSettled;
    private int daysOfStaying;
    private static final long serialVersionUID = 1L;

    // Конструктор за замовчуванням
    public Room() {
        this.number = 0;
        this.description = "";
        this.seats = 0;
        this.price = 0;
        this.available = true;
        this.dateOfSettled = "";
        this.daysOfStaying = 0;
    }

    // Конструктор з параметрами
    public Room(int number, String description, int seats, int price, boolean available, String dateOfSettled, int daysOfStaying) {
        this.number = number;
        this.description = description;
        this.seats = seats;
        this.price = price;
        this.available = available;
        this.dateOfSettled = dateOfSettled;
        this.daysOfStaying = daysOfStaying;
    }

    @Override
    public String toString() {
        return "Кімната №" + getNumber() + "\nДоступність: " + isAvailable() +
        "\nКількість місць: " + getSeats() + "\nВартість проживання: " + getPrice() +
                " грн\nОпис номера: " + getDescription() + "\nДата заселення: " + getDateOfSettled() +
                "\nТермін проживання: " + getDaysOfStaying() + " дн.\n";

    }

    // Методи геттери для полів класу
    public int getNumber() {
        return number;
    }
    public String getDescription() {
        return description;
    }
    public int getSeats() {
        return seats;
    }
    public int getPrice() {
        return price;
    }
    public boolean isAvailable() {
        return available;
    }
    public String getDateOfSettled() {
        return dateOfSettled;
    }
    public int getDaysOfStaying() {
        return daysOfStaying;
    }
}
