// 13.Create a Room class with fields: roomNumber, isBooked, pricePerNight, nightsBooked.
// 
// Add methods:
// 
// bookRoom(int nights) → set booked status and nights.
// 
// calculateBill() → returns pricePerNight * nightsBooked.
// 
// In main, create multiple rooms, book them, and display bills.


class Room {
    int roomNumber;
    boolean isBooked;
    double pricePerNight;
    int nightsBooked;


    void bookRoom(int nights) {
        isBooked = true;
        nightsBooked = nights;
    }

    double calculateBill() {
        return pricePerNight * nightsBooked;
    }
}

public class HotelRoomBooking {
    public static void main(String[] args) {
        Room room1 = new Room();
        Room room2 = new Room();

        room1.roomNumber = 101;
        room1.pricePerNight = 3500;

        room2.roomNumber = 102;
        room2.pricePerNight = 5500;

        room1.bookRoom(3);
        room2.bookRoom(5);

        System.out.println("Room " + room1.roomNumber + " | Booked: " + room1.isBooked + " | Bill: " + room1.calculateBill());
        System.out.println("Room " + room2.roomNumber + " | Booked: " + room2.isBooked + " | Bill: " + room2.calculateBill());
    }
}
