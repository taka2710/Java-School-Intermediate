import java.util.Random;
public class Practice11_03 {
    public static void main(String[] args) {
        int X = 1;
        int num = 0;
        while (X <= 10){
            // 1~6の乱数をnumに代入
            num = new Random().nextInt(6) + 1;
            if (1 == num % 2) {
                System.out.println(X + "回目、" + num + "が出ました");
                X++;
            }
            else {
                X++;
            }
        }

    }
}
