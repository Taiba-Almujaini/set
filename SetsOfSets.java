
import java.util.HashSet;
import java.util.Arrays;
public class SetsOfSets {
    public static void main(String[] args) {

        HashSet<HashSet<Integer>> setOfset = new HashSet<>();// create set of set

        // create 3 sets with integers values
        HashSet<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(3, 8, 1));
        setOfset.add(set1);
        HashSet<Integer> set2 = new HashSet();
        set2.addAll(Arrays.asList(8, 9, 11));
        setOfset.add(set2);
        HashSet<Integer> set3 = new HashSet();
        set3.addAll(Arrays.asList(8, 5, 2));
        setOfset.add(set3);

        HashSet<Integer> unique = new HashSet<>(); // create set to retain union of sets


        for (HashSet<Integer> set : setOfset) {
            // Add all integers from the current set to the HashSet of unique
            unique.addAll(set);
        }

        // Print all unique integers from all sets combined
        System.out.println("Unique integers of 3 sets :");
        System.out.println(unique);

    }


}
