import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
//        Comparator comparator = new Comparator(3);
        Comparator<Person> comparator = (Person o1, Person o2) -> {
            int maxWords = 3;
            int wordsCount1 = o1.getSurname().split(" ").length;
            int wordsCount2 = o2.getSurname().split(" ").length;
            if (wordsCount1 >= maxWords && wordsCount2 >= maxWords) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            if (wordsCount1 > wordsCount2) {
                return 1;
            } else if (wordsCount1 < wordsCount2) {
                return -1;
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };
        Collections.sort(list, comparator);
        System.out.println(list);
    }
}
