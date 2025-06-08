import java.util.TreeSet;
import java.util.Set;

class Lesson12_02 {
    public static void main(String[] args) {
        
        // TreeSetデータを作成　右辺のデータ型は省略可
        Set<Integer> ts = new TreeSet<>();
        //値を追加
        ts.add(1);
        ts.add(5);
        ts.add(2);
        ts.add(3);
        ts.add(2);
        // ts.add(null); エラーになります
        ts.add(4);
        ts.remove(3); // 指定した値を削除

        System.out.println(ts);
    }

}
