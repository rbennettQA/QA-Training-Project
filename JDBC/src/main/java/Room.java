public class Room {
    private String location;
    private String roomName;
    private String type;
    private int beds;
    private double price;
    private boolean available;

    public Room(String location, String roomName, String type, int beds, double price, boolean available) {
        this.location = location;
        this.roomName = roomName;
        this.type = type;
        this.beds = beds;
        this.price = price;
        this.available = available;
    }


}
