import java.util.ArrayList;
public class User {
    private String name;
    private int age;
    private double balance;
    private ArrayList<Ticket> orderHistory;
    private boolean premium;

    public User(String name, int age, double balance, boolean premium) {// конструктор User приминает переменные пользователя и присваивает их параметрам
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.orderHistory = new ArrayList<>();
        this.premium = premium;
    }
    public void setName(String name) {//сеттер который дает значение пользователя нашему параметру
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setOrderHistory(ArrayList<Ticket> orderHistory) {
        this.orderHistory = orderHistory;
    }
    public void setPremium(boolean premium){
        this.premium = premium;
    }

    public String getName() {//геттер который возвращяет его
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Ticket> getOrderHistory() {
        return orderHistory;
    }

    public void addTicketToOrderHistory(Ticket ticket) {
        this.orderHistory.add(ticket);
    }
    public boolean getPremium(){
        return premium;
    }
    public double getTotal() {
        double total = 0;
        for (Ticket ticket : orderHistory)
            if (getPremium() == true) {
                total += ticket.getPrice() * 0.8;
            } else if (getPremium() == false) {
                total += ticket.getPrice();
            }
        return total;
    }
}
