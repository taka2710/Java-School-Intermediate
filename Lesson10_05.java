import java.util.Random;

class Lesson10_05 {
    public static void main(String[] args) {
        System.out.println("今日のゴミ回収の種類は");
        // 1~7の乱数を に代入
        int day = new Random().nextInt(7) + 1;

        System.out.println(
            // メソッドの引数に switch 式をコーディングすることもできようになりました
            switch (day) {
                case 1, 3, 5 -> "燃えるゴミの日です";
                case 2 -> "燃えないゴミの日です";
                case 4 -> "プラスチックゴミの日です";
                case 6 -> "ビン・カンゴミの日です";
                default -> "ごみの回収はありません";
            }
        );
    }
}
