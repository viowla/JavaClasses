public class Patient {

    private int id;
    private int medicalCardNo;
    private String name;
    private String surname;
    private String patronymic;
    private String address;
    private String phone;
    private String diagnosis;

    public Patient(int id, int medicalCardNo, String name, String surname, String patronymic, String address, String phone, String diagnosis) {
        this.id = id;
        this.medicalCardNo = medicalCardNo;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.phone = phone;
        this.diagnosis = diagnosis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMedicalCardNo() {
        return medicalCardNo;
    }

    public void setMedicalCardNo(int medicalCardNo) {
        this.medicalCardNo = medicalCardNo;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", medicalCardNo=" + medicalCardNo +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}