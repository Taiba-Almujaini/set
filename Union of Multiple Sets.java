
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
public class main{
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.addAll(Arrays.asList(5, 20, 53, 4,5));

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.addAll(Arrays.asList(17, 20, 32, 4,51));

        HashSet<Integer> set3 = new HashSet<Integer>();
        set3.addAll(Arrays.asList(20, 5, 32, 4,11));


        HashSet<Integer> union = new HashSet<>();// Create a new HashSet to store the union


        union.addAll(set1);// Add all elements from set1 to the union
        union.addAll(set2);// Add all elements from set2 to the union
        union.addAll(set3);// Add all elements from set3 to the union

        // Print the union
        System.out.println("union of set1 ,set2 and set3:");
        System.out.println(union);
    }


}