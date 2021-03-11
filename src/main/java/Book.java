public class Book {

    private int id;
    private int year;
    private int pagesNumber;
    private int cost;
    private String title;
    private String authors;
    private String publishHouse;
    private String bindingType;

    public Book(int id, int year, int pagesNumber, int cost, String title, String authors, String publishHouse, String bindingType) {
        this.id = id;
        this.year = year;
        this.pagesNumber = pagesNumber;
        this.cost = cost;
        this.title = title;
        this.authors = authors;
        this.publishHouse = publishHouse;
        this.bindingType = bindingType;
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

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublishHouse() {
        return publishHouse;
    }

    public void setPublishHouse(String publishHouse) {
        this.publishHouse = publishHouse;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", year=" + year +
                ", pagesNumber=" + pagesNumber +
                ", cost=" + cost +
                ", title='" + title + '\'' +
                ", authors='" + authors + '\'' +
                ", publishHouse='" + publishHouse + '\'' +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }

}