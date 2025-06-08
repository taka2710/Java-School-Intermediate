import java.util.InputMismatchException;
import java.util.Scanner;
public class ComprehensiveIntermediate01_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 入力処理を行う
        try { 
            System.out.println("入力してください");
            int inputNum = scanner.nextInt();
                if (inputNum % 2 == 0){
                    System.out.println("even");
                }
                else if(inputNum % 2 == 1 || inputNum % 2 == -1) {
                    System.out.println("odd");
                }
                scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("偶数でも奇数でもありません。");
        }
        System.out.println("処理終了");
    }
}
