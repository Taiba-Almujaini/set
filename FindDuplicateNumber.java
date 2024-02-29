import java.util.*;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] numbers = {3,3,2,8,6,4,5,2,};
        Set<Integer> numberSet = new HashSet<>(); //set for store array numbers
        Set<Integer> duplicates = new HashSet<>();// set for store duplicate numbers in array

        for (int n : numbers) {
            // If add() returns false, it means the element is already present in the set
            if (!numberSet.add(n)) {
                duplicates.add(n);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found");
        } else {
            System.out.println("Duplicates found: " + duplicates);
        }
    }
}
