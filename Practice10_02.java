import java.util.Random;

class Practice10_02 {
    public static void main(String[] args) {
        System.out.println("あなたは");
        // 0~20の乱数をageに代入
        int age = new Random().nextInt(21);
        
        System.out.println(
            switch(age) {
                case 0, 1, 2, 3 -> "babyです";
                case 18, 19, 20 -> "adultです";
                default -> "kidです";
            }
        );
    }    
}
