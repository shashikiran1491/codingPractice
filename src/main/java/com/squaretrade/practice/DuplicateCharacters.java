import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacters {

    public static void main(String[] args) {

        String str = "programming";

        Map<Character, Long> map = str.chars().mapToObj(c -> (char) c).collect
                (Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey)
                .forEach(System.out::println);

        System.out.println(map);

    }

}
