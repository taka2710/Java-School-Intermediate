import java.util.HashSet;
import java.util.Set;

public class Lesson12_01 {
    public static void main(String[] args) {
        
        // HashSetデータを作成
        Set<Integer> hs = new HashSet<Integer>();
        // 値を追加
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(2);
        hs.add(null);
        hs.add(4);
        hs.remove(3); // 指定した値を削除

        System.out.println(hs);
    }
}
