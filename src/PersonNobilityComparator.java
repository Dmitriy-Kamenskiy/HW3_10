import java.util.Comparator;
public class PersonNobilityComparator implements Comparator<Person> {
    protected int maxWord;

    public PersonNobilityComparator(int maxWord) {
        this.maxWord = maxWord;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int result = 0;
        int numWords1 = o1.getSurname().split("\\P{IsAlphabetic}+",maxWord).length;
        int numWords2 = o2.getSurname().split("\\P{IsAlphabetic}+",maxWord).length;

        result = Integer.compare(numWords1, numWords2);
        if (result == 0){
            result = Integer.compare(o1.getAge(), o2.getAge());
        }
        return result;
    }
}
