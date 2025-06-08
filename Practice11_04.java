import java.util.Scanner;
public class Practice11_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 入力処理を行う
        System.out.println("入力してください > ");
        int inputNum = scanner.nextInt();
        if (1 <= inputNum && inputNum <= 5) {
            scanner.close();
        }
        // 2.をやり直すための処理を書く
        if (inputNum < 1 || 5 < inputNum) {
            while (inputNum < 1 || 5 < inputNum){
                System.out.print("何段>");
                inputNum = scanner.nextInt();
                if (1 <= inputNum && inputNum <= 5) {
                    scanner.close();
                }
            }
        }           
        for (int row = 1; row <= inputNum; row++){
            if (row > 1) {
                System.out.println("");
            }
            for (int column = 1; column <= inputNum; column++){
                if (row <= inputNum - column) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
        }    
    }        
}


