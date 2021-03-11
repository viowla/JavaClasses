import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        ArrayList<Student> students=new ArrayList<Student>();
        ArrayList<Abiturient> abiturients=new ArrayList<Abiturient>();
        ArrayList<Book> books=new ArrayList<Book>();
        ArrayList<Car> cars=new ArrayList<Car>();
        ArrayList<Customer> customers=new ArrayList<Customer>();
        ArrayList<House> houses=new ArrayList<House>();
        ArrayList<Patient> patients=new ArrayList<Patient>();
        ArrayList<Phone> phones=new ArrayList<Phone>();
        ArrayList<Product> products=new ArrayList<Product>();
        ArrayList<Train> trains=new ArrayList<Train>();


        System.out.println("What do you want?");
        System.out.println("1. Abiturient");
        System.out.println("2. Book");
        System.out.println("3. Car");
        System.out.println("4. Customer");
        System.out.println("5. House");
        System.out.println("6. Patient");
        System.out.println("7. Phone");
        System.out.println("8. Product");
        System.out.println("9. Student");
        System.out.println("10. Train");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){

            //Abiturient
            case 1:
                System.out.println("What do yo want?");
                System.out.println("1. список абитуриентов, имеющих неудовлетворительные оценки");
                System.out.println("2. список абитуриентов, у которых сумма баллов выше заданной");
                System.out.println("3. выбрать заданное число n " +
                        "абитуриентов, имеющих самую высокую сумму баллов");
                int abChoice= sc.nextInt();
                switch (abChoice){
                    case 1:
                        for (Abiturient value : abiturients) {
                            for (int j = 0; j < value.getGrades().size(); j++) {
                                if (value.getGrades().get(j) < 3) {
                                    System.out.println(value.toString());
                                }
                            }
                        }
                    case 2:
                        int inSum=sc.nextInt();
                        for (Abiturient abiturient : abiturients) {
                            for (int j = 0; j < abiturient.getGrades().size(); j++) {
                                int sum = 0;
                                sum += abiturient.getGrades().get(j);
                                if (sum > inSum) {
                                    System.out.println(abiturient.toString());
                                }
                            }
                        }
                    case 3:

                    default:
                        throw new IllegalStateException("Unexpected value: " + abChoice);
                }

                //Book
            case 2:
                System.out.println("What do yo want?");
                System.out.println("1. список книг заданного автора");
                System.out.println("2. список книг, выпущенных заданным издательством");
                System.out.println("3. список книг, выпущенных после заданного года");
                int bookChoice= sc.nextInt();
                switch (bookChoice){
                    case 1:
                        String author=sc.next();
                        for (Book value : books) {
                            if (value.getAuthors().equals(author)) {
                                value.toString();
                            }
                        }
                        break;
                    case 2:
                        String pubHouse=sc.next();
                        for (Book book : books) {
                            if (book.getPublishHouse().equals(pubHouse)) {
                                book.toString();
                            }
                        }
                    case 3:
                        String date = sc.next();
                        Date inputDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
                        for (Student student : students) {
                            if (student.getDate().after(inputDate)) {
                                student.toString();
                            }
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + choice);
                }

                //Car
            case 3:
                System.out.println("What do yo want?");
                System.out.println("1. список автомобилей заданной марки");
                System.out.println("2. список автомобилей заданной модели, " +
                        "которые эксплуатируются больше n лет");
                System.out.println("3. список автомобилей заданного года " +
                        "выпуска, цена которых больше указанной");
                int carChoice= sc.nextInt();
                switch (carChoice){
                    case 1:
                        String brand = sc.next();
                        for (Car car:cars){
                            if (car.getBrand().equals(brand)){
                                car.toString();
                            }
                        }
                    case 2:
                        String model=sc.next();
                        int n=sc.nextInt();
                        for (Car car:cars){
                            if (car.getModel().equals(model)&&car.getYear()>n){
                                car.toString();
                            }
                        }
                    case 3:
                        int year1=sc.nextInt();
                        int cost=sc.nextInt();
                        for (Car car:cars){
                            if (car.getYear()==year1&&car.getCost()>cost){
                                car.toString();
                            }
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + choice);
                }

                //Customer
            case 4:
                System.out.println("What do yo want?");
                System.out.println("1. список покупателей в алфавитном порядке");
                System.out.println("2. список покупателей, у которых номер кредитной " +
                        "карточки находится в заданном интервале");
                int custChoice= sc.nextInt();
                switch (custChoice){
                    case 1:
                        Collections.sort(customers, new Comparator<Customer>() {
                            @Override
                            public int compare(Customer item, Customer t1) {
                                String s1 = item.getName();
                                String s2 = t1.getName();
                                return s1.compareToIgnoreCase(s2);
                            }
                        });
                        System.out.println(customers.toString());
                        break;
                    case 2:
                        int min=sc.nextInt();
                        int max=sc.nextInt();
                        for (Customer customer:customers){
                            if (min<customer.getCreditCardNo()&&customer.getCreditCardNo()<max){
                                customer.toString();
                            }
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + choice);
                }

                //House
            case 5:
                System.out.println("What do yo want?");
                System.out.println("1. список квартир, имеющих заданное число комнат");
                System.out.println("2. список квартир, имеющих заданное число комнат " +
                        "и расположенных на этаже, который находится в заданном промежутке");
                System.out.println("3. список квартир, имеющих площадь, превосходящую заданную");
                int houseChoice= sc.nextInt();
                switch (houseChoice){
                    case 1:
                        int room=sc.nextInt();
                        for (House house:houses){
                            if (house.getRoomsNumber()==room){
                                house.toString();
                            }
                        }
                        break;
                    case 2:
                        int roomNo=sc.nextInt();
                        int minFloor=sc.nextInt();
                        int maxFloor=sc.nextInt();
                        for (House house:houses){
                            if (house.getRoomsNumber()==roomNo&&house.getFloor()<maxFloor&&house.getFloor()>minFloor){
                                house.toString();
                            }
                        }
                        break;
                    case 3:
                        int flatSpace=sc.nextInt();
                        for (House house:houses){
                            if (house.getFlatSpace()>flatSpace){
                                house.toString();
                            }
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + choice);
                }

                //Patient
            case 6:
                System.out.println("What do yo want?");
                System.out.println("1. список пациентов, имеющих данный диагноз");
                System.out.println("2.  список пациентов, номер медицинской карты которых находится в заданном интервале");
                int patChoice= sc.nextInt();
                switch (patChoice){
                    case 1:
                        String diagnos=sc.next();
                        for (Patient patient: patients){
                            if (patient.getDiagnosis().contains(diagnos)){
                                patient.toString();
                            }
                        }
                    case 2:
                        int min=sc.nextInt();
                        int max=sc.nextInt();
                        for (Patient patient:patients){
                            if (patient.getMedicalCardNo()<max && patient.getMedicalCardNo()>min){
                                patient.toString();
                            }
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + choice);
                }

                //Phone
            case 7:
                System.out.println("What do yo want?");
                System.out.println("1. сведения об абонентах, у которых время внутригородских разговоров превышает заданное");
                System.out.println("2. сведения об абонентах, которые пользовались междугородной связью");
                System.out.println("3. сведения об абонентах в алфавитном порядке");
                int phoneChoice= sc.nextInt();
                switch (phoneChoice){
                    case 1:
                        int time=sc.nextInt();
                        for (Phone phone:phones){
                            if (phone.getCallTime()>time){
                                phone.toString();
                            }
                        }
                        break;
                    case 2:
                        for (Phone phone:phones){
                            if (!phone.getAddress().equals("Almaty")){
                                phone.toString();
                            }
                        }
                        break;
                    case 3:
                        Collections.sort(phones, new Comparator<Phone>() {
                            @Override
                            public int compare(Phone item, Phone t1) {
                                String s1 = item.getName();
                                String s2 = t1.getName();
                                return s1.compareToIgnoreCase(s2);
                            }
                        });
                        System.out.println(phones.toString());
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + phoneChoice);
                }

                //Product
            case 8:
                System.out.println("What do yo want?");
                System.out.println("1. список товаров для заданного наименования");
                System.out.println("2. список товаров для заданного наименования, цена которых не превосходит заданную");
                System.out.println("3. список товаров, срок хранения которых больше заданного");
                int prodChoice= sc.nextInt();
                switch (prodChoice){
                    case 1:
                        String title=sc.next();
                        for (Product item : products) {
                            if (item.getTitle().equals(title)) {
                                item.toString();
                            }
                        }
                    case 2:
                        String title1=sc.next();
                        int cost = sc.nextInt();
                        for (Product value : products) {
                            if (value.getTitle().equals(title1) && value.getCost() <= cost) {
                                value.toString();
                            }
                        }
                    case 3:
                        int lifetime = sc.nextInt();
                        for (Product product : products) {
                            if (product.getLifetime() > lifetime) {
                                product.toString();
                            }
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + choice);
                }

                //Student
            case 9:
                System.out.println("What do yo want?");
                System.out.println("1. список студентов заданного факультета");
                System.out.println("2. списки студентов для каждого факультета и курса");
                System.out.println("3. список студентов, родившихся после заданного года");
                System.out.println("4.  список учебной группы");
                int studChoice= sc.nextInt();
                switch (studChoice){
                    case 1:
                        String faculty=sc.next();
                        for (Student item : students) {
                            if (item.getFaculty().equals(faculty)) {
                                item.toString();
                            }
                        }
                    case 2:

                    case 3:
                        String date = sc.next();
                        Date inputDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
                        for (Student value : students) {
                            if (value.getDate().after(inputDate)) {
                                value.toString();
                            }
                        }
                    case 4:
                        String group = sc.next();
                        for (Student student : students) {
                            if (student.getGroup().equals(group)) {
                                student.toString();
                            }
                        }
                    default:
                        throw new IllegalStateException("Unexpected value: " + choice);

                }

                //Train
            case 10:
                System.out.println("What do yo want?");
                System.out.println("1. список поездов, следующих до заданного пункта назначения");
                System.out.println("2. список поездов, следующих до заданного пункта назначения и отправляющихся после заданного часа");
                System.out.println("3. список поездов, отправляющихся до заданного пункта назначения и имеющих общие места");
                int trainChoice= sc.nextInt();
                switch (trainChoice){
                    case 1:
                        String dest= sc.next();
                        for (Train item : trains) {
                            if (item.getDestination().equals(dest)) {
                                item.toString();
                            }
                        }
                    case 2:
                        String dest1= sc.next();
                        String time = sc.next();
                        SimpleDateFormat  ft = new SimpleDateFormat("hh:mm:ss a");
                        Time dTime = (Time) ft.parse(time);
                        for (Train value : trains) {
                            if (value.getDestination().equals(dest1) && value.getTime().after(dTime)) {
                                value.toString();
                            }
                        }
                    case 3:
                        String dest2=sc.next();
                        int seat=sc.nextInt();
                        for (Train train : trains) {
                            if (train.getDestination().equals(dest2) && train.getSeatNumb() == seat) {
                                train.toString();
                            }
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + choice);
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }

    }


}
