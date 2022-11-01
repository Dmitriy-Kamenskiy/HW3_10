import java.util.*;

public class Main {
        public static void main(String[] args) {
            List<Person> personList = new ArrayList<>();
            personList.add(new Person("Ursula", "fon der Leyen",64));
            personList.add(new Person("Joseph Robinette", "Biden",79));
            personList.add(new Person("Arnold Alois", "Schwarzenegger",75));
            personList.add(new Person("Mohamed bin Zayed", "Al Nahyan", 61));

            System.out.println(personList);

            Comparator<Person> comparator = (o1, o2)-> {
                int result = 0;
                int numWords1 = o1.getSurname().split("\\P{IsAlphabetic}+",2).length;
                int numWords2 = o2.getSurname().split("\\P{IsAlphabetic}+",2).length;

                result = Integer.compare(numWords1, numWords2);
                if (result == 0){
                    result = Integer.compare(o1.getAge(), o2.getAge());
                }
                return result;
            };

            Collections.sort(personList,comparator);

            System.out.println(personList);
    }
}
