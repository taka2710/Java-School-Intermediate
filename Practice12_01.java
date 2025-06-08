public class Practice12_01 {
    public static void main(String[] args) {
        
        int x = 5;
        int y = 2;

        int diff = diffDown(x, y);

        System.out.println("diff = " + diff);
    }
    private static int diffDown(int x, int y){
        return x - y;
    }
}
