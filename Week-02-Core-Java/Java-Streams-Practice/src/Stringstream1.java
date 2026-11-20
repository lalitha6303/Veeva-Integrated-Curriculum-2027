import java.util.*;
import java.util.stream.Collectors;
public class Stringstream1 {
    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("hello","welcome","java","c","python","dl","ml");
       List<String>lengthfilter=words.stream()
            .filter(s->s.length()>4)
               .collect(Collectors.toList());
       System.out.println(lengthfilter);
        List<String>uppercasefilter=words.stream()
                .map(s->s.toUpperCase())   //here we cant use the  filter as filter ccepts only boolean condition but here it return string so we use map
                .collect(Collectors.toList());
        System.out.println(uppercasefilter);
        List<String>sortfilter=words.stream()

                .sorted()//here we cant use the  filter as filter ccepts only boolean condition but here it return string so we use map
                .collect(Collectors.toList());
        System.out.println(sortfilter);

        List<String>sortdescfilter=words.stream()

                .sorted(Comparator.reverseOrder())//here we cant use the  filter as filter ccepts only boolean condition but here it return string so we use map
                .collect(Collectors.toList());
        System.out.println(sortdescfilter);

    }
}
