import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CinemaSystem {
    private ArrayList<User> users;
    private ArrayList<Movie> movies;
    private ArrayList<Ticket> tickets;

    public CinemaSystem() {
        this.users = new ArrayList<>();
        this.movies = new ArrayList<>();
        this.tickets = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }


    public void addUser(User user) {
        this.users.add(user);
    }

    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    public String getMovies(int i) {//используем геттер чтобы вернуть значение из параметра movies
        return this.movies.get(i).getMovie_name() + " " + this.movies.get(i).getGenre() + " " + this.movies.get(i).getAge_restriction();
    }

    // this.movies.get(i).getMovie_name() это чтобы мы внутри мувис[i] смогли обратиться к Movie_name
    public String getUsers(int i) {
        return this.users.get(i).getName() + " " + this.users.get(i).getAge() + " " + this.users.get(i).getBalance() + " " + this.users.get(i).getOrderHistory();
    }

    public String getTickets(int i) {
        return this.tickets.get(i).getId() + " " + this.movies.get(i).getMovie_name() + " " + this.tickets.get(i).getDate() + " " + this.tickets.get(i).getTime() + " " + this.tickets.get(i).getPrice();
    }

    public void buyTicket(User user, Movie movie, String date, String time, Ticket ticket) {//при использовании метода пользователь покупает билет
        if (user.getAge() >= movie.getAge_restriction()) {
            if (user.getBalance() >= user.getTotal()) {
                tickets.add(ticket);
                user.addTicketToOrderHistory(ticket);
                System.out.print("You are welcome!");
            } else {
                System.out.print("Not enough money(");
            }
        } else {
            System.out.print("You are too young(");
        }
    }

    public void sort(List<Ticket> tickets) {
        Comparator<Ticket> byRank = Comparator.comparing(Ticket::getPrice);
        tickets.stream().sorted(byRank).map(p -> p.getPrice() + " " + p.getMovieName() + " " + p.getDate()).collect(Collectors.toList()).forEach(System.out::println);
    }
}

