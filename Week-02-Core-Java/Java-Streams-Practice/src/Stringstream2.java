import java.util.*;import java.util.function.Function;
import java.util.stream.Collectors;
public class Stringstream2 {
    public static void main(String[] args)
    {
        String word="helloh";
        Character res=word.chars() //converts string into intstream h,e,l,l,o,h
           //converts interger charcater values to character objects
         .mapToObj(c->(char)c)
        .filter(c->word.indexOf(c)==word.lastIndexOf(c))  //check whether character occurs only once.check frst and last index of each charcater
       .findFirst() // if frst and lastindex same for multiple letters then return only frst charcater.
      .orElse(null);
    System.out.println("first non repeating charcater:"+res);
}
}


//Map<Character, Long> frequency = str.chars()
//        .mapToObj(c -> (char) c)
//        .collect(Collectors.groupingBy(
//                Function.identity(),
//                LinkedHashMap::new,
//                Collectors.counting()
//        ));
//
//Character result = frequency.entrySet().stream()
//        .filter(e -> e.getValue() == 1)
//        .map(Map.Entry::getKey)
//        .findFirst()
////        .orElse(null);