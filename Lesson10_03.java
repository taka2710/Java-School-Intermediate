import java.util.Random;

class Lesson10_03 {
    public static void main(String[] args) {
        System.out.println("赤ちゃんの性別は");
        // 1~4の乱数を gender に代入
        int gender = new Random().nextInt(4) + 1;
        //変数が「1, 2」の場合は「女の子」と、複数 case をまとめて一つの処理に分岐させることもできます。
        switch (gender) {
            case 1:
            case 2:
                System.out.println("女の子です");
                break;
            case 3:
                System.out.println("男の子です");
                break;
            default:
                System.out.println("特定できませんでした");
        }
    }
}