
import java.util.HashSet;
import java.util.Arrays;
public class main{
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.addAll(Arrays.asList(5, 20, 53, 4,5));

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.addAll(Arrays.asList(17, 20, 32, 4,51));

        set1.retainAll(set2);//it will retain only elements found in set 2

        System.out.println("set1 after modification : "+set1);

    }


}