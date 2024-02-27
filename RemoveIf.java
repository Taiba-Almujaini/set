
import java.util.HashSet;
import java.util.Arrays;
public class RemoveIf {
    public static void main(String[] args) {


        //create set and add numbers
        HashSet<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(3, 8, 1,5,9));

        System.out.println("set before remove 3 :"+ set1); //before remove 3

        if (set1.contains(3)) {
            //check if 3 is present, and remove it
            set1.remove(3);
            System.out.println("Number 3 removed from the set.");
            System.out.println("set after remove 3 :"+ set1);
        } else {
            // If 3 is not present print
            System.out.println("Number 3 is not present in the set.");
        }

    }

}
