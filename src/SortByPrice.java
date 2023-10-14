import java.util.Comparator;

class SortByPrice implements Comparator<Ticket> {
    public int compare(Ticket a, Ticket b) {
        return (int) (a.getPrice() - b.getPrice());
    }
}
