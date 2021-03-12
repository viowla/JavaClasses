public class Customer {
    private int id;
    private int creditCardNo;
    private int bankAccountNo;
    private String name;
    private String surname;
    private String patronymic;
    private String address;

    public Customer(int id, int creditCardNo, int bankAccountNo, String name, String surname, String patronymic, String address) {
        this.id = id;
        this.creditCardNo = creditCardNo;
        this.bankAccountNo = bankAccountNo;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(int creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    public int getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(int bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", creditCardNo=" + creditCardNo +
                ", bankAccountNo=" + bankAccountNo +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}