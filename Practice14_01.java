public class Practice14_01 {
    public static void main(String[] args) {
    
        try {
            String sum = null;
            System.out.println(sum.length());
        }   catch (NullPointerException e){
                System.out.println("ぬるぽをキャッチしました。");
        }   finally {
                System.out.println("finally ブロックです。");
        }
        System.out.println("処理終了");
    }
}
