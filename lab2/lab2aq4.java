
public class lab2aq4 {

    public static void main(String[] args) {

        // Create roomA
        HotelRoom roomA = new HotelRoom(200, "Single", 1, 100);

        // Create roomB
        HotelRoom roomB = new HotelRoom(201, "Double", 0, 80);

        // Try to book roomB for the first time
        System.out.println("Trying to book Room B:");

        if (roomB.isOccupied() == false) {
            roomB.setOccupied(1);
            System.out.println("Room B has been booked.");
        } else {
            System.out.println("Room B is already occupied.");
        }

        System.out.println();

        // Try to book roomB for the second time
        System.out.println("Trying to book Room B again:");

        if (roomB.isOccupied() == false) {
            roomB.setOccupied(1);
            System.out.println("Room B has been booked.");
        } else {
            System.out.println("Room B is already occupied. Booking denied.");
        }

        System.out.println();

        // Print final room details
        System.out.println("Room B Details:");
        System.out.println("Room Number: " + roomB.getRoomNumber());
        System.out.println("Room Type: " + roomB.getRoomType());
        System.out.println("Occupied: " + roomB.isOccupied());
        System.out.println("Rate: " + roomB.getRate());
    }
}
