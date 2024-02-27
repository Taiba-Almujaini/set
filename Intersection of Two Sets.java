
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
public class IntersectionTwoSets{
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.addAll(Arrays.asList(5, 20, 53, 4,5));

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.addAll(Arrays.asList(17, 20, 32, 4,51));

        HashSet<Integer> Intersection = new HashSet<>(set1);// Create a new HashSet to store the intersection

        Intersection.retainAll(set2);

        System.out.println("Intersection of set1 and set2:");  // Print the intersection
        System.out.println(Intersection);
    }


}
