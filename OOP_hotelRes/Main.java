package OOP_hotelRes;

class Room{
    private String roomType;
    private int roomNumber;
    private boolean isAvailable;

    public Room(String roomType, int roomNumber, boolean isAvailable){
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.isAvailable = isAvailable;
    }
    public void setRoomType(String roomType){
        this.roomType = roomType;
    }
    public String getRoomType(){
        return roomType;
    }
    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }
    public int getRoomNumber(){
        return roomNumber;
    }
    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
    public boolean getIsAvailable(){
        return isAvailable;
    }

    public void reserveRoom(){
        if (isAvailable){
            isAvailable = false;
            System.out.println(roomType + " Room reserved successfully" );
        }
        else{
            System.out.println("Room not available");
        }
    }
    public boolean checkAvailability(){
        return isAvailable;
    }

}


class Hotel{
    private Room[] rooms;
    public Hotel(){
        this.rooms = new Room[5];
    }

    public void addRoom(Room room){
        for (int i = 0; i < rooms.length; i++){
            if (rooms[i] == null){
                rooms[i] = room;
                break;
            }
        }
    }

    public void displayRooms(){
        for (Room room : rooms){
            if (room != null){
                System.out.println(room.getRoomNumber() + " : " + room.getRoomType() + " : " + room.getIsAvailable());
            }
        }
    }

    public void reserveRoom(int roomNumber){
        for (Room room : rooms){
            if (room != null && room.getRoomNumber() == roomNumber){
                room.reserveRoom();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Room room1 = new Room("Single", 101, true);
        Room room2 = new Room("Double", 102, true);
        Room room3 = new Room("Suite", 103, true);
        
        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);
        
        hotel.reserveRoom(102);
        hotel.displayRooms();
        
    }
    
}
