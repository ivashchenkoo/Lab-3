public class Main {
    public static void main(String[] args) {
        Room[] room = {new Room(01, "15315sadasd", 2, 250, true, "", 0),
        new Room(02, "1135103", 3, 360, false, "31.01.2016",7)};

        Hotel hotel = new Hotel(room);
        hotel.printRooms();
    }
}
