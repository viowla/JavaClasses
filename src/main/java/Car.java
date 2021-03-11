public class Car {

    private int id;
    private int year;
    private int cost;
    private int registerNo;
    private String brand;
    private String model;
    private String color;

    public Car(int id, int year, int cost, int registerNo, String brand, String model, String color) {
        this.id = id;
        this.year = year;
        this.cost = cost;
        this.registerNo = registerNo;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(int registerNo) {
        this.registerNo = registerNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", year=" + year +
                ", cost=" + cost +
                ", registerNo=" + registerNo +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
