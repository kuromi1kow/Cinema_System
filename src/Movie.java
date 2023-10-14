import java.util.ArrayList;
public class Movie {
    private String movie_name;
    private String genre;
    private int age_restriction;
    public Movie(){}
    public Movie(String movie_name, String genre, int age_restriction){// это котсруктор с 3 параметрами который сразу присвоит их значения нашим параметрам
        this.movie_name = movie_name;
        this.genre = genre;
        this.age_restriction = age_restriction;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAge_restriction(int age_restriction) {
        this.age_restriction = age_restriction;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public String getGenre() {
        return genre;
    }

    public int getAge_restriction() {
        return age_restriction;
    }

}
