import java.util.*;

public class Main {
        public static void main(String[] args) {
            List<Person> personList = new ArrayList<>();
            personList.add(new Person("Ursula", "fon der Leyen",64));
            personList.add(new Person("Joseph Robinette", "Biden",79));
            personList.add(new Person("Arnold Alois", "Schwarzenegger",75));
            personList.add(new Person("Mohamed bin Zayed", "Al Nahyan", 61));

            System.out.println(personList);

            Collections.sort(personList, new PersonNobilityComparator(2));

            System.out.println(personList);
    }
}
