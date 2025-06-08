public class Practice12_03 {
    public static void main(String[] args){
        greet("朝");
        greet("昼");
        greet("夜");
    }
    public static void greet(String x) {
        if (x == "朝") {
            String a = x + "morning";
            String b = "Good " + a + "!!";
            String 朝の挨拶 = b.replace("朝", "");
            System.out.println(朝の挨拶);
        }
        else if (x == "昼") {
            String c = x + "afternoon";
            String d = "Good " + c + "!!";
            String 昼の挨拶 = d.replace("昼", "");
            System.out.println(昼の挨拶);
        }
        else if (x == "夜") {
            String e = x + "evening";
            String f = "Good " + e + "!!";
            String 夜の挨拶 = f.replace("夜", "");
            System.out.println(夜の挨拶);
        }
    }
}