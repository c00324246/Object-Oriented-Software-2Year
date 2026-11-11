
public class lab2aq2 {

    public static void main(String[] args) {

        HotelRoom roomA = new HotelRoom();
        HotelRoom roomB = new HotelRoom();

        // Set roomA details
        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");
        roomA.setOccupied(1);
        roomA.setRate(100);

        // Set roomB details
        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");
        roomB.setOccupied(0);
        roomB.setRate(80);

        // Print roomA details
        System.out.println("Room A:");
        System.out.println("Room Number: " + roomA.getRoomNumber());
        System.out.println("Room Type: " + roomA.getRoomType());
        System.out.println("Occupied: " + roomA.getOccupied());
        System.out.println("Rate: " + roomA.getRate());

        System.out.println();

        // Print roomB details
        System.out.println("Room B:");
        System.out.println("Room Number: " + roomB.getRoomNumber());
        System.out.println("Room Type: " + roomB.getRoomType());
        System.out.println("Occupied: " + roomB.getOccupied());
        System.out.println("Rate: " + roomB.getRate());
    }
}
