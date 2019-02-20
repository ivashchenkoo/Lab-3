public class Room {
    // Оголошення змінних для збереження даних про номер
    private final String description;
    private final int seats;
    private final int price;
    private boolean available;
    private String dateOfSettled;
    private int daysOfStaying;

    // Конструктор за замовчуванням
    public Room() {
        this.description = "";
        this.seats = 0;
        this.price = 0;
        this.available = true;
        this.dateOfSettled = "";
        this.daysOfStaying = 0;
    }

    // Конструктор з параметрами
    public Room(String description, int seats, int price, boolean available, String dateOfSettled, int daysOfStaying) {
        this.description = description;
        this.seats = seats;
        this.price = price;
        this.available = available;
        this.dateOfSettled = dateOfSettled;
        this.daysOfStaying = daysOfStaying;
    }

    // Методи геттери для полів класу
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
