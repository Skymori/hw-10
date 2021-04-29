import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class HomeWorkTenth {
    public static String taskNumberOne(List<String> names){
        return names.stream()
                .map(name -> (names.indexOf(name))+", "+ name)
                .filter(name -> Integer.parseInt(name.substring(0,1))%2 ==1)
                .collect(Collectors.joining(", "));
    }
    public static List<String> taskNumberTwo(List<String> list){
        return list.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(toList());
    }
    public static String taskNumberThree (String[] strings){
        return Arrays.stream(strings)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .sorted(Comparator.comparingInt(Integer::parseInt))
                .collect(Collectors.joining(", "));
    }
    public static Stream<Long> taskNumberFor(long a, long c, long m, long seed){
        if (check(a, c, m, seed)){
            return Stream.iterate(seed, n -> (a * n + c) %m);
        }else {
            throw new RuntimeException("Not Correct parameter");
        }
    }
    //taskNumberFive
    public static boolean check(long a, long c, long m, long seed){
        return (m>=2
                && a>=0 && a<m
                && c>=0 && c<m
                && seed>=0 && seed<m);
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        return Stream.concat(first,second).collect(Collectors.collectingAndThen(
                toList(),list -> { Collections.shuffle(list);
                    return list.stream();
                }));
    }
}
