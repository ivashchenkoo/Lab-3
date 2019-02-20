public class Hotel {
    // Оголошення масиву типу даних користувача Room для збереження об'єктів класу Room
    private Room[] rooms;

    // Конструктор з параметром (приймає масив об'єктів класу Room)
    public Hotel(Room[] list){
        rooms = list;
    }

    // Метод printRooms - виводить дані про всі кімнати готелю
    public void printRooms(){
        // Цикл for_each для перебору всіх елементів масиву rooms
        for (Room el : rooms) {
            System.out.println("Кімната №" + el.getNumber() + "\nДоступність: " + el.isAvailable() +
                    "\nКількість місць: " + el.getSeats() + "\nВартість проживання: " + el.getPrice() +
                    " грн\nОпис номера: " + el.getDescription() + "\nДата заселення: " + el.getDateOfSettled() +
                    "\nТермін проживання: " + el.getDaysOfStaying() + " дн.\n");
        }
    }

    // Метод printRooms - виводить дані про вільні чи зайняті кімнати готелю
    public void printRooms(boolean isAvailable){
        if (isAvailable) {
            System.out.println("Вільні кімнати:");
            for (Room el : rooms) {
                if (el.isAvailable() == isAvailable)
                    System.out.println("Кімната №" + el.getNumber() + "\nКількість місць: " + el.getSeats() +
                            "\nВартість проживання: " + el.getPrice() + " грн\nОпис номера: " +
                            el.getDescription() + "\n");
            }
        }
        else {
            System.out.println("Зайняті кімнати:");
            for (Room el : rooms) {
                if (el.isAvailable() == isAvailable)
                    System.out.println("Кімната №" + el.getNumber() + "\nКількість місць: " + el.getSeats() +
                            "\nВартість проживання: " + el.getPrice() + " грн\nОпис номера: " + el.getDescription() +
                            "\nДата заселення: " + el.getDateOfSettled() + "\nТермін проживання: " +
                            el.getDaysOfStaying() + " дн.\n");
            }
        }
    }

    // Метод findRooms - знайходить кімнати за вказаними параметрами ціни та к-ть місць і виводить дані про них
    public void findRooms (int seats, int price){
        for (Room el : rooms) {
            if (el.getSeats() == seats && el.getPrice() <= price && el.isAvailable() == true) {
                System.out.println("Номер знайдений:");
                System.out.println("Кімната №" + el.getNumber() + "\nКількість місць: " + el.getSeats() +
                        "\nВартість проживання: " + el.getPrice() + " грн\nОпис номера: " + el.getDescription() +
                        "\nДата заселення: " + el.getDateOfSettled() + "\nТермін проживання: " + el.getDaysOfStaying()
                        + " дн.\n");
            }
        }
    }
}
