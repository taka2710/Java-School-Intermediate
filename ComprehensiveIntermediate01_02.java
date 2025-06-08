import java.util.NoSuchElementException;
import java.util.Scanner;
public class ComprehensiveIntermediate01_02 {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        try {
            Scanner scanner = new Scanner(System.in);
            for (int i =0; i < 3; i++) {
                // 入力処理を行う
                System.out.println("入力してください");
                intArray[i] = scanner.nextInt();
            }
            if (intArray[0] <= intArray[1] && intArray[1] <= intArray[2]){
                System.out.println("OK");
            }
            else {
                System.out.println("NG");
            }
            scanner.close();
        } catch (NoSuchElementException e) {
            System.out.println("OKでもNGでもありません。");
        }
        System.out.println("処理終了です。");
        
    }
}
