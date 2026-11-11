
public class lab2aq3 {

    public static void main(String[] args) {

        // Create roomA
        HotelRoom roomA = new HotelRoom();
        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");
        roomA.setOccupied(1);
        roomA.setRate(100);

        // Create roomB
        HotelRoom roomB = new HotelRoom();
        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");
        roomB.setOccupied(0);
        roomB.setRate(80);

        // Create roomC using the new constructor
        HotelRoom roomC = new HotelRoom(202, "Single", 0, 90);

        // Print roomC details
        System.out.println("Room C:");
        System.out.println("Room Number: " + roomC.getRoomNumber());
        System.out.println("Room Type: " + roomC.getRoomType());
        System.out.println("Occupied: " + roomC.getOccupied());
        System.out.println("Rate: " + roomC.getRate());
    }
}
