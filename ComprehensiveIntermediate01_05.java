public class ComprehensiveIntermediate01_05 {
    public static void main(String[] args) {
        for (int row = 1; row < 10; row++) {

            for(int column = 1; column < 10; column++) {
                int answer = row * column;
                for (int i = 0; i <= column - 1; i++) {
                    System.out.print("");
                }
                System.out.printf("%2d", answer);
            }
            System.out.println("");
        }
    }
}
