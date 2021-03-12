public class Phone {

    private int id;
    private int creditCardNo;
    private int debit;
    private int credit;
    private String name;
    private String surname;
    private String patronymic;
    private String address;
    private int callTime;

    public Phone(int id, int creditCardNo, int debit, int credit, String name, String surname, String patronymic, String address, int callTime) {
        this.id = id;
        this.creditCardNo = creditCardNo;
        this.debit = debit;
        this.credit = credit;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.callTime = callTime;
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

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
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

    public int getCallTime() {
        return callTime;
    }

    public void setCallTime(int callTime) {
        this.callTime = callTime;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", creditCardNo=" + creditCardNo +
                ", debit=" + debit +
                ", credit=" + credit +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", callTime='" + callTime + '\'' +
                '}';
    }
}