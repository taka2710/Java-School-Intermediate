import java.util.NoSuchElementException;
import java.util.Scanner;

public class ComprehensiveIntermediate01_03 {
    public static void main(String[] args) {
        double[] doubleArray = new double[3];
        try {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                // 入力処理を行う
                System.out.println("入力してください");
                doubleArray[i] = scanner.nextDouble();
            }
            double a = doubleArray[0];
            double b = doubleArray[1];
            double c = doubleArray[2];
            if (b * b - 4 * a * c > 0 ) {
                System.out.println("2つの実数解です。");
            }
            else if (b * b - 4 * a * c == 0) {
                System.out.println("重解です。");
            }
            else {
                System.out.println("2つの虚数解です。");
            }
            scanner.close();
        } catch (NoSuchElementException e) {
            // ここのコメント考える必要あり。定義域等。
            System.out.println("解はありません。");
        } finally {
            System.out.println("処理終了です。");
        }
    }
}
