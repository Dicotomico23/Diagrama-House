package House;

import House.Rooms.*;

public class House {
    private static final int MAX_RESTROOMS = 10;
    private static final int MAX_BEDROOMS = 10;
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private RestRoom[]restRooms = new RestRoom[MAX_RESTROOMS];
    private BedRoom []bedRooms = new BedRoom[MAX_BEDROOMS];
    private Yard yard;

    public Kitchen getKitchen() {
        return kitchen;
    }
    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }
    public DiningRoom getDiningRoom() {
        return diningRoom;
    }
    public void setDiningRoom(DiningRoom diningRoom) {
        this.diningRoom = diningRoom;
    }
    public LivingRoom getLivingRoom() {
        return livingRoom;
    }
    public void setLivingRoom(LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }
    public RestRoom[] getRestRooms() {
        return restRooms;
    }
    public void setRestRooms(RestRoom[] restRooms) {
        this.restRooms = restRooms;
    }
    public BedRoom[] getBedRooms() {
        return bedRooms;
    }
    public void setBedRooms(BedRoom[] bedRooms) {
        this.bedRooms = bedRooms;
    }
    public Yard getYard() {
        return yard;
    }
    public void setYard(Yard yard) {
        this.yard = yard;
    }

    //Additional Getters and Setters
    public static int contBedrooms;
    public static int contRestrooms;
    public void addRoom(BedRoom bedroom){
        bedRooms[contBedrooms] = bedroom;
    }
    public void addRoom(RestRoom restroom){
        restRooms[contRestrooms] = restroom;
    }
}
