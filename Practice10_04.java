import java.util.Random;

class Practice10_04{

    public static void main(String[] args) {
        // 1~5の乱数をcolorに代入
        int color = new Random().nextInt(5) + 1;
        System.out.println(
            switch(color) {
                case 1 -> "今日のラッキーカラーは ピンク です";
                case 2, 3, 4 -> "今日のラッキーカラーは レッド です";
                default -> "今日のラッキーカラーは グリーン です";
            }

        );
    }
}
