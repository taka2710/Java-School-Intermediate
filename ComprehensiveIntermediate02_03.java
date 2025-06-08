import java.util.Random;
import java.util.Scanner;

public class ComprehensiveIntermediate02_03 {
    public static void main(String[] args) {
        String check = "begin";
        System.out.println("ゾロ目で大当たり！チャンスは30回");
        Scanner scanner = new Scanner(System.in);
        // 入力処理を行う
        System.out.println("begin と入力してください");
        String start = scanner.next();
        // beginと入力されなかった場合、もう一度標準入力の箇所に戻る
        if (!(start).equals(check)) {
            System.out.println("もう一度入力をお願いします。");
            System.exit(0);
        }
        int[] intArray = new int[3];
        for (int j = 1; j < 31; j++) {
            for (int i = 0; i < 3; i++) {
                intArray[i] = new Random().nextInt(9);
            }
            int a = intArray[0];
            int b = intArray[1];
            int c = intArray[2];
            System.out.println(j + "回目：" + a + b + c);
            if (intArray[0] == intArray[1] && intArray[1] == intArray[2] && intArray[0] == intArray[2]) {
                System.out.println(j + "回目で大当たりです。おめでとうございます！");
                break;
            }
            else if (j == 30) {
                System.out.println("残念でした。終わります。");
            }
        }
        scanner.close();
    }
}