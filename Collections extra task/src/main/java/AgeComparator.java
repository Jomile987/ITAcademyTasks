import java.util.Comparator;

public class AgeComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return Double.compare(o1.getAge(),o2.getAge());
    }
}
