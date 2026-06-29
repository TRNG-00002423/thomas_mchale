import java.util.HashSet;

public class MoneyDemo {
    public static void main(String[] args) {
        Money m1 = new Money("USD", 1000);
        Money m2 = new Money("USD", 1000);

        HashSet<Money> mySet = new HashSet<>();

        mySet.add(m1);
        mySet.add(m2);

        System.out.println(mySet.size());
        System.out.println(m1 == m2);
        System.out.println(m1.equals(m2));
    }
}