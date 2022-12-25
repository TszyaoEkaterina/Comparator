public class Comparator implements java.util.Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().split(" ").length > o2.getSurname().split(" ").length) {
            return 1;
        } else if (o1.getSurname().split(" ").length < o2.getSurname().split(" ").length) {
            return -1;
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
