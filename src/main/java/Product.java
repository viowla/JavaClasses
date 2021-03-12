public class Product {

    private int id, cost, lifetime, number;
    private String title, upc, brand;

    public Product(int id, int cost, int lifetime, int number, String title, String upc, String brand) {
        this.id = id;
        this.cost = cost;
        this.lifetime = lifetime;
        this.number = number;
        this.title = title;
        this.upc = upc;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", cost=" + cost +
                ", lifetime=" + lifetime +
                ", number=" + number +
                ", title='" + title + '\'' +
                ", upc='" + upc + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}