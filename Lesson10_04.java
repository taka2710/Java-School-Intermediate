import java.util.Random;

class Lesson10_04 {
    public static void main(String[] args) {
        System.out.println("今日のゴミ回収の種類は");
        // 1~7の乱数を  に代入
        int day = new Random().nextInt(7) + 1;
        // Java SE 12 では switch式 が導入されており、この式は(すべての式と同様に)単一の値として評価され、文で使用することができます。
        switch (day) {
            case 1, 3, 5 -> System.out.println("燃えるゴミの日です");
            // また、 矢印case ラベルも導入され、これによりフォール・スルーを防ぐための break文 は必要なくなりました。
            case 2 -> System.out.println("燃えないゴミの日です");
            case 4 -> System.out.println("プラスチックゴミの日です");
            case 6 -> System.out.println("ビン・カンゴミの日です");
            default -> System.out.println("ごみの回収はありません");
        }
    }
}