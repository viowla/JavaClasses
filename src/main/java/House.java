public class House {

    private int id;
    private int flatNo;
    private int flatSpace;
    private int floor;
    private int roomsNumber;
    private int lifetaime;
    private String street;
    private String houseType;

    public House(int id, int flatNo, int flatSpace, int floor, int roomsNumber, int lifetaime, String street, String houseType) {
        this.id = id;
        this.flatNo = flatNo;
        this.flatSpace = flatSpace;
        this.floor = floor;
        this.roomsNumber = roomsNumber;
        this.lifetaime = lifetaime;
        this.street = street;
        this.houseType = houseType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }

    public int getFlatSpace() {
        return flatSpace;
    }

    public void setFlatSpace(int flatSpace) {
        this.flatSpace = flatSpace;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoomsNumber() {
        return roomsNumber;
    }

    public void setRoomsNumber(int roomsNumber) {
        this.roomsNumber = roomsNumber;
    }

    public int getLifetaime() {
        return lifetaime;
    }

    public void setLifetaime(int lifetaime) {
        this.lifetaime = lifetaime;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", flatNo=" + flatNo +
                ", flatSpace=" + flatSpace +
                ", floor=" + floor +
                ", roomsNumber=" + roomsNumber +
                ", lifetaime=" + lifetaime +
                ", street='" + street + '\'' +
                ", houseType='" + houseType + '\'' +
                '}';
    }
}
