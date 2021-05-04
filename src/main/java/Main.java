import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Oleh", "Vlad", "Nick", "John", "Ivan");
        String[] strings = {"1, 2, 0", "4, 5"};
        System.out.println("Task Number One : ");
        System.out.println(HomeWorkTenth.taskNumberOne(names));
        System.out.println("Task Number Two : ");
        System.out.println(HomeWorkTenth.taskNumberTwo(names));
        System.out.println("Task Number Three : ");
        System.out.println(HomeWorkTenth.taskNumberThree(strings));
        System.out.println("Task Number For : ");
        System.out.println(HomeWorkTenth.taskNumberFor(25214903917L, 11,(long) Math.pow(2,48),13)
                .limit(15)
                .collect(Collectors.toList()));
        System.out.println("Task Number Five");
        System.out.println(HomeWorkTenth.zip(IntStream.range(31, 45).boxed(),
                IntStream.range(21, 31).boxed()).collect(Collectors.toList()));
    }
}
