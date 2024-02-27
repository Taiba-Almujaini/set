
import java.util.HashSet;
import java.util.Arrays;
public class main{
    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<>();
        set1.addAll(Arrays.asList("Taiba", "Ahmed","Ameera", "Ali"));

        HashSet<String> set2 = new HashSet();
        set2.addAll(Arrays.asList("Ahmed", "Taif", "Omar"));

        HashSet<String> checkDisjoint = new HashSet(set1); //create copy of set1 to check if there are common elements with set2
        checkDisjoint.retainAll(set2);// it will retain only common elements

        if (checkDisjoint.isEmpty())
        {
            System.out.println("Disjoint");
        }
        else
        {
            System.out.println("Not Disjoint");
        }

    }


}