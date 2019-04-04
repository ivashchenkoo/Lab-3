import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Ініціалізація масиву об'єктів Room, який містить 15 елементів - номерів
        Room[] room = {new Room(101, "Просторий 2-місний номер", 2, 250, true, "", 0),
                new Room(102, "Дешево і сердито", 3, 360, false, "31.01.2019",7),
                new Room(103, "Є телевізор", 2, 500, true, "",0),
                new Room(104, "Номер-Люкс", 2, 800, true, "",0),
                new Room(105, "Гарний номер з 2-ма ліжками", 2, 360, false, "20.01.2019",2),
                new Room(106, "Номер для одного", 1, 250, true, "",0),
                new Room(107, "Є телевізор", 1, 350, false, "19.02.2019",3),
                new Room(108, "Маленький 3-х місний дешевий номер", 3, 300, true, "",0),
                new Room(109, "2-х місний номер", 2, 360, true, "",0),
                new Room(200, "Маленький 3-х місний дешевий номер", 3, 330, false, "06.02.2019",6),
                new Room(201, "Є телевізор", 1, 300, true, "",0),
                new Room(202, "Є Кондиціонер", 3, 430, true, "",0),
                new Room(203, "Є телевізор", 1, 360, false, "30.01.2019",5),
                new Room(204, "Просторий та затишний", 2, 440, false, "20.02.2019",1),
                new Room(205, "Є телевізор та кондиціонер", 2, 800, false, "31.01.2019",2),
        };

        // Створення об'єкту Hotel в конструктор якого передається масив об'єктів Room
        Hotel hotel = new Hotel(room);
        /**Lab-3**/
        // Окреме виведення вільних та зайнятих номерів
        //hotel.printRooms(true);
        //hotel.printRooms(false);

        // Пошук вільних помешкань з вказаною кількістю місць та допустимою вартістю проживання
        //hotel.findRooms(2,400);

        /**Lab-8**/
        String fileName = "lab8.txt";
        Room[] rooms = new Room[15];
        Hotel hotel1 = new Hotel(rooms);

        hotel.writeToFile(fileName);

        hotel1.readFromFile(fileName);

        hotel1.printRooms();



    }
}
