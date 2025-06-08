import java.util.Random;

class Practice10_01 {
    public static void main (String[] args) {
        System.out.println("あなたは");
        // 0~1の乱数をgenderに代入
        int gender = new Random().nextInt(2);
        switch(gender) {
            case 0:
                System.out.println("男です");
                break;
            case 1:
                System.out.println("女です");
                break;

        }
    }
}

