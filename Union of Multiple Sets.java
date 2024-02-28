
import java.util.HashSet;
import java.util.Arrays;

public class UnionOfSets {
    public static void main(String[] args) {

        HashSet<Integer> firstSet = new HashSet<Integer>();
        firstSet.addAll(Arrays.asList(5, 20, 53, 4,5));

        HashSet<Integer> secondSet = new HashSet<Integer>();
        secondSet.addAll(Arrays.asList(17, 20, 32, 4,51));

        HashSet<Integer> thirdSet = new HashSet<Integer>();
        thirdSet.addAll(Arrays.asList(20, 5, 32, 4,11));


        HashSet<Integer> unionSet = new HashSet<>();// Create a new HashSet to store the union


        unionSet.addAll(firstSet);// Add all elements from set1 to the union
        unionSet.addAll(secondSet);// Add all elements from set2 to the union
        unionSet.addAll(thirdSet);// Add all elements from set3 to the union

        // Print the union
        System.out.println("union of firstSet ,secondSet and thirdSet:");
        System.out.println(unionSet);
    }


}
