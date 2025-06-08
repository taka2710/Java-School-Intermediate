import java.util.Random;
public class Practice14_02 {
    public static void main(String[] args) {

        try {
            // こちらに処理を記述
            Random rand = new Random();
            int sum = rand.nextInt(2);
            if (sum == 0){
                int result = sum / 0;
                System.out.println(result);
            }
            else if (sum == 1){
                String imit = "ぬるぽ" + sum;
                String Nullp = imit.replace("ぬるぽ1", null);
                System.out.println(Nullp.length());
            }    
        } catch (ArithmeticException e) {
            // 値が0の場合:ArithmeticException
            System.out.println("計算例外をキャッチしました。");
        } catch (NullPointerException e) {
            // 値が1の場合:NullPointerException
            System.out.println("ぬるぽをキャッチしました。");
        } finally {
            System.out.println("finally 計算終了");
        }
        System.out.println("処理終了");
    }
}
