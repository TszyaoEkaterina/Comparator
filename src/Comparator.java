public class Comparator implements java.util.Comparator<Person> {
    int maxWords;

    @Override
    public int compare(Person o1, Person o2) {
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
    }

    public Comparator(int maxWords) {
        this.maxWords = maxWords;
    }
}
