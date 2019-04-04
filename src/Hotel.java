import java.io.*;

public class Hotel implements Serializable {
    // Оголошення масиву типу даних користувача Room для збереження об'єктів класу Room
    private Room[] rooms;


    // Конструктор з параметром (приймає масив об'єктів класу Room)
    public Hotel(Room[] list){
        rooms = list;
    }

    public Hotel(Hotel hotel) {
        this.rooms = hotel.rooms;
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

    // Метод для запису об'єктів у файл
    public boolean writeToFile(String fileName) {
        File file = new File(fileName);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        boolean flag = false;
        try{
            fos = new FileOutputStream(file);
            if (fos != null) {
                oos = new ObjectOutputStream(fos);
                for (Room el : rooms){
                    oos.writeObject(el);
                }
                flag = true;
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл для запису даних не створено: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Помилка запису даних: " + e.getMessage());
        }
        finally {
            if(oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    System.err.println("Помилка при закритті файлу: " + e);
                }
            }
        }
        return flag;
    }

    // Метод для зчитування об'єктів з файлу
    public Room[] readFromFile(String fileName) {
        File file = new File(fileName);
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        int i = 0;
        Room room = null;
        boolean flag = true;
        try{
            fis = new FileInputStream(file);
            if (fis != null){
                ois = new ObjectInputStream(fis);
                while (true)
                {
                    try{
                        room = (Room) ois.readObject();
                        rooms[i++] = room;
                    }
                    catch(Exception e){
                        break;
                    }
                }
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("Файл " + file.getName() + " не знайдено: " + e);
        }
        /*catch (ClassNotFoundException e) {
            System.err.println("Клас не існує: " + e);
        }*/
        catch (IOException e) {
            System.err.println("Помилка при зчитуванні даних з файлу: " + e.getMessage());
        }
        finally {
            if(ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    System.err.println("Помилка при закритті файлу: " + e);
                }
            }
        }
        return rooms;
    }
}
