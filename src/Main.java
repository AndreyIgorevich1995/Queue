import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        System.out.println(queue);
        while (!queue.isEmpty()) {
            Person a = queue.poll();
            a.numberTickets--;
            System.out.println(a.name + " " + a.surname + " прокатился на аттракционе, осталось билетов: " + a.numberTickets);
            if (a.numberTickets != 0) {
                queue.offer(a);
            }
        }
    }

    public static List<Person> generateClients() {
        return List.of(new Person("Igor", "Ivanov", 3),
                new Person("Alex", "Gornov", 8),
                new Person("Vasya", "Trubin", 6),
                new Person("Elena", "Auseva", 10),
                new Person("Nastya", "Radonechskaya", 9));
    }
    /*public static List<Person> generateClients() {
        List<Person> person = new ArrayList<>();
        Person Igor = new Person("Igor", "Ivanov", 3);
        Person Alex = new Person("Alex", "Gornov", 8);
        Person Vasya = new Person("Vasya", "Trubin", 6);
        Person Elena = new Person("Elena", "Auseva", 10);
        Person Nastya = new Person("Nastya", "Radonechskaya", 9);
        person.add(Igor);
        person.add(Alex);
        person.add(Vasya);
        person.add(Elena);
        person.add(Nastya);
        return person;
    }*/
}