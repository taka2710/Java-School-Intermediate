import java.util.Random;

class Lesson10_06 {
    public static void main(String[] args) {
        System.out.println("今日のゴミの回収の種類は");
        // 1~7の乱数を　に代入
        int day = new Random().nextInt(7) + 1;

        int result_yield = switch (day) {
            case 1, 3, 5 -> {
                System.out.println("燃えるゴミの日です");
                yield day;   
            }
            case 2 -> {
                System.out.println("燃えないゴミの日です");
                yield day;
            }
            case 4 -> {
                System.out.println("プラスチックゴミの日です");
                yield day;
            }
            case 6 -> {
                System.out.println("ビン・カンゴミの日です");
                yield day;
            }
            default -> {
                System.out.println("ごみの回収はありません");
                yield day;
            }
        };
        System.out.println("day の値は" + result_yield + "でした");

    }
}

