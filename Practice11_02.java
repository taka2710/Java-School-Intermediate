public class Practice11_02 {
    public static void main(String[] args) {
        boolean flgDo = false;

        // do-while文を使った処理を記述する。
        int i = 0;
        do {
            System.out.println((i + 1) + "回のみの表示です");
            i++;
        } while (flgDo == true);
        
    }
}
