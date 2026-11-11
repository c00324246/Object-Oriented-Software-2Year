
public class lab2aq1 {

    public static void main(String[] args) {

        // Create two room objects
        HotelRoom roomA = new HotelRoom();
        HotelRoom roomB = new HotelRoom();

        // Set values for roomA
        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");

        // Set values for roomB
        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");

        // Print room details
        System.out.println("Room A:");
        System.out.println("Room Number: " + roomA.getRoomNumber());
        System.out.println("Room Type: " + roomA.getRoomType());

        System.out.println();

        System.out.println("Room B:");
        System.out.println("Room Number: " + roomB.getRoomNumber());
        System.out.println("Room Type: " + roomB.getRoomType());
    }
}
