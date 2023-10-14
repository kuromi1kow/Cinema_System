import java.util.ArrayList;
import java.util.Collections;

public class Main {//наш меин
    public static void main(String[] args) {
        CinemaSystem cinemaSystem = new CinemaSystem();//создаем объект Mega
        User Tomiris = new User("Tomiris", 17, 1600, true);// объект Томирис
        User Default = new User("Default", 18, 1600, false);
        ArrayList <Movie> fantasy = new ArrayList<>();// создаем фентези это массив из трех элементов Movie

        Movie one = new Movie("Avatar", "fantasy", 15);//даем значения каждому из них
        Movie two = new Movie("Wendesday", "fantasy", 16);
        Movie three = new Movie("Monsters on vacation", "fantasy", 6);

        fantasy.add(one);
        fantasy.add(two);
        fantasy.add(three);

        ArrayList<Ticket> tickets = new ArrayList<>();

        Ticket ticket1 = new Ticket(11, "Avatar", "06.01.23", "23:00", 2000);
        Ticket ticket2 = new Ticket(38, "Monsters on vacation", "07.01.23", "11:00", 1400);
        Ticket ticket3 = new Ticket(49, "Wendesday", "08.01.23", "16:30", 1500);

        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);

        Tomiris.addTicketToOrderHistory(ticket1);
//
//
        Default.addTicketToOrderHistory(ticket1);
//
//        cinemaSystem.addTicket(ticket1);//тут добавляем билеты
//        cinemaSystem.addTicket(ticket2);
//        cinemaSystem.addTicket(ticket3);

        Tomiris.getOrderHistory();

        for (int i = 0; i < 3; i++) {//заводим цикл который будет добавлять фильмы в наш лист билетов
            cinemaSystem.addMovie(fantasy.get(i));
        }

        for(int i = 0; i < 3; i++){
            System.out.println(cinemaSystem.getMovies(i));//выводим каждый
        }

        cinemaSystem.addTicket(ticket1);
        cinemaSystem.addTicket(ticket2);
        cinemaSystem.addTicket(ticket3);


        for(int i=0;i<3;i++){
            System.out.println((cinemaSystem.getTickets(i)));//выводим
        }


        cinemaSystem.sort(tickets);

        for(int i=0;i<3;i++) {
            cinemaSystem.getTickets(i);
        }


        cinemaSystem.buyTicket(Tomiris, one, "06.01.23", "23:00", ticket1);//покупка премиум пользователя
        System.out.println();

        cinemaSystem.buyTicket(Default, one, "07.01.23", "15:00", ticket1);// покупка обычного пользователя


    }
}