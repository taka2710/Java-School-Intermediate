import java.util.Random;
// java.util:パッケージ。必要な場合はimport文を宣言。→なんでimport分を宣言する必要あるのか。
class Lesson10_01 {
    public static void main(String[] args) {
        System.out.println("あなたの運勢を占います");
        // 1~4の乱数を fortune に代入
        int fortune = new Random().nextInt(4) + 1;

        if (fortune == 1) {
            System.out.println("大吉");
        } else if (fortune == 2) {
            System.out.println("中吉");
        } else if (fortune == 3) {
            System.out.println("吉");
        } else {
            System.out.println("凶");
        }
    }
}