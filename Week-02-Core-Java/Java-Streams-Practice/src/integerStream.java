import java.util.*;
import java.util.stream.Collectors;
public class integerStream {
    public static void main(String[]args)
    {
        List<Integer>nums=Arrays.asList(1,4,6,12,8,6);
        List<Integer>res=nums.stream()
                .filter(n->n>5)
                .map(n->n*n)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(nums);
        System.out.println(res);

        List<Integer>res2=nums.stream()

    }
}
