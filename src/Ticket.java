import java.util.ArrayList;
public class Ticket {//создаем класс Ticket
    private int id;
    private String movieName;
    private String date;
    private String time;
    private double price;
    public Ticket(){}

    public Ticket(int id, String movieName, String date, String time, double price) {
        this.id = id;
        this.movieName = movieName;
        this.date = date;
        this.time = time;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getId() {
        return id;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public String getMovieName() {
        return movieName;
    }
}
