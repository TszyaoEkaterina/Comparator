import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Денис", "Андреев", 15));
        list.add(new Person("Георгий", "Николаев", 6));
        list.add(new Person("Джон", "Миллер Джонсон", 10));
        list.add(new Person("Антуан", "Джонс де Пальма", 8));
        list.add(new Person("Питер", "Вильямс", 30));
        list.add(new Person("Питер", "Ван дер Венн", 30));
        Comparator comparator = new Comparator(3);
        Collections.sort(list, comparator);
        System.out.println(list);
    }
}
