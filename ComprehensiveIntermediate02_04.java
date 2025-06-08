import java.util.Scanner;
import java.util.Random;

public class ComprehensiveIntermediate02_04 {
    public static void main(String[] args) {
        System.out.println("ジャンケン");
        System.out.println("0:グー 1:チョキ 2: パー");
        Scanner scanner = new Scanner(System.in);
        System.out.println("数字を入力してください");
        int jyanken = scanner.nextInt();
        do {
            switch (jyanken) {
                case 0:
                    System.out.println("グー");
                    break;
                case 1:
                    System.out.println("チョキ");
                    break;
                case 2:
                    System.out.println("パー");
                    break;
                default:
                    System.out.println("もう一度入力してください");
                    continue;
            }
            scanner.close();
        } while (jyanken < 0 && jyanken > 2);       
        // どうやって1.に戻る？
        int jyanken2 = new Random().nextInt(2);
        switch (jyanken2) {
                case 0:
                    System.out.println("あなたはグー");
                    break;
                case 1:
                    System.out.println("あなたはチョキ");
                    break;
                case 2:
                    System.out.println("あなたはパー");
                    break;
        }
        if (jyanken == jyanken2) {
            System.out.println("あいこです");
        } else if (jyanken == 0 && jyanken2 == 2) {
            System.out.println("あなたの勝利です");
        } else if (jyanken == 1 && jyanken2 == 0) {
            System.out.println("あなたの勝利です");
        } else if (jyanken == 2 && jyanken2 == 1) {
            System.out.println("あなたの勝利です");
        } else {
            System.out.println("あなたの負けです");
        }   
    }
}
