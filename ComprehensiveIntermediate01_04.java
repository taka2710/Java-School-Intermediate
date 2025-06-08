import java.util.InputMismatchException;
import java.util.Scanner;
public class ComprehensiveIntermediate01_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("人数を入力してください。");
        try {
            int people = scanner.nextInt();
            if (0 < people && people < 5) {
                int admissionfee = 600 * people;
                System.out.println(people + "名様分の入場料は" + admissionfee + "円です。");
            }
            else if (5 <= people && people <= 20) {
                int admissionfee = 550 * people;
                System.out.println(people + "名様分の入場料は" + admissionfee + "円です。");
            }
            else if (20 < people) {
                int admissionfee = 500 * people;
                System.out.println(people + "名様分の入場料は" + admissionfee + "円です。");
            }
            else {
                System.out.println("適切な値を入力してください。");
            }
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("ご確認の上、もう一度入場する人数を入力してください。");
        } finally {
            System.out.println("処理を終了します。");
            scanner.close();
        }
    }
}
