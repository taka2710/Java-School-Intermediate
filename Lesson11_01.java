class Lesson11_01 {
    public static void main(String[] args) {
        int i = 0;
        while (i > -1) {
            if (i > 10) {
                break;
            } else if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println((i + 1) + "回目の処理です");
            i++;
        }
        System.out.println("処理が終了しました。");
    }    
}
