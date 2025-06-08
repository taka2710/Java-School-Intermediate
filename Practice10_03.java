import java.util.Random;

class Practice10_03{
    public static void main(String[] args) {
        // 0~20の乱数をageに代入
        int age = new Random().nextInt(21);
        int gender = new Random().nextInt(2);
            switch(age) {
                case 0, 1, 2, 3 -> {
                    // 0~1の乱数をgenderに代入
                    switch(gender) {
                        case 0 -> {
                            System.out.println("あなたは babyな男 です");
                        }
                        default -> {
                            System.out.println("あなたは babyな女 です");
                        }
                    };
                }
                case 4, 5 -> {
                    // 0~1の乱数をgenderに代入
                    switch(gender) {
                        case 0 -> {
                            System.out.println("あなたは childな男 です");
                        }
                        default -> {
                            System.out.println("あなたは childな女 です");
                        }
                    };
                }
                case 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 -> {
                    // 0~1の乱数をgenderに代入
                    switch(gender) {
                        case 0 -> {
                            System.out.println("あなたは kidな男 です");
                        }
                        default -> {
                            System.out.println("あなたは kidな女 です");
                        }
                    };
                }
                default -> {
                    // 0~1の乱数をgenderに代入
                    switch(gender) {
                        case 0 -> {
                            System.out.println("あなたは adultな男 です");
                        }
                        default -> {
                            System.out.println("あなたは adultな女 です");
                        }
                    };
                }
            };
        }
    }
