// 13.Create a Room class with fields: roomNumber, isBooked, pricePerNight, nightsBooked.
// 
// Add methods:
// 
// bookRoom(int nights) → set booked status and nights.
// 
// calculateBill() → returns pricePerNight * nightsBooked.
// 
// In main, create multiple rooms, book them, and display bills.

// use constructor

class Room {
    int roomNumber;
    boolean isBooked;
    double pricePerNight;
    int nightsBooked;

    Room(int roomNumber, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.pricePerNight = pricePerNight;
        this.isBooked = false;
        this.nightsBooked = 0;
    }

    void bookRoom(int nights) {
        isBooked = true;
        nightsBooked = nights;
    }

    double calculateBill() {
        return pricePerNight * nightsBooked;
    }
}

public class HotelRoomBookingConstructor {
    public static void main(String[] args) {
        Room room1 = new Room(101, 2000);
        Room room2 = new Room(102, 3500);

        room1.bookRoom(3);
        room2.bookRoom(5);

        System.out.println("Room " + room1.roomNumber + " | Booked: " + room1.isBooked + " | Bill: " + room1.calculateBill());
        System.out.println("Room " + room2.roomNumber + " | Booked: " + room2.isBooked + " | Bill: " + room2.calculateBill());
    }
}
