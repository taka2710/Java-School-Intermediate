import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Set;

public class Practice15_02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("kubo");
        list.add("mitoma");
        list.add("kamada");
        list.add("kamada");

        Set <String> set = new TreeSet<String>(list);

        System.out.println(set);
    }
}
