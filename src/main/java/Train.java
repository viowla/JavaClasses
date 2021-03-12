import java.sql.Time;

public class Train {

    private String destination;
    private int trainNo, seatNumb;
    private Time time;

    public Train(String destination, int trainNo, Time time, int seatNumb) {
        this.destination = destination;
        this.trainNo = trainNo;
        this.time = time;
        this.seatNumb = seatNumb;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getSeatNumb() {
        return seatNumb;
    }

    public void setSeatNumb(int seatNumb) {
        this.seatNumb = seatNumb;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", trainNo=" + trainNo +
                ", time=" + time +
                ", seatNumb=" + seatNumb +
                '}';
    }
}