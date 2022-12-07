import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer>number1 = new LinkedHashSet<>(Arrays.asList(0,1,2));
        LinkedHashSet<Integer>number2 = new LinkedHashSet<>(Arrays.asList(1,2,3));
        System.out.println(symmetricDifference(number1,number2));
    }
    public static Set<Integer> symmetricDifference(Set<Integer>s1,Set<Integer>s2){
        Set<Integer> symmetricDiff = new HashSet<>(s1);
        symmetricDiff.addAll(s2);
        Set<Integer> tmp = new HashSet<>(s1);
        tmp.retainAll(s2);
        symmetricDiff.removeAll(tmp);
        return symmetricDiff;

    }

}