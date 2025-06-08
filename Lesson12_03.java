import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Lesson12_03 {
    public static void main(String[] args) {
        
        Set<String> set = new HashSet<String>();
        set.add("C");
        set.add("C");
        set.add("B");
        set.add("A");

        List<String> list = new ArrayList<String>(set);

        System.out.println(list);
    }
}
