public class Lesson09_01 {
    public static void main(String[] args) {
        
        int x = 2;
        int y = 3;

        int sum = sumUp(x, y);

        System.out.println("sum = " + sum);
    }
    private static int sumUp(int x, int y){
        return x + y;
    }
}
