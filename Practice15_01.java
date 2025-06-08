import java.util.ArrayList;
import java.util.List;
public class Practice15_01 {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<String>();

        list.add("kubo");
        list.add("mitoma");
        list.add("kamada");
        list.add("kamada");

        for (int i = 0; i < 4; i++) {
            System.out.println(list.get(i));
        }   
    }
}
