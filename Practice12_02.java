public class Practice12_02 {
    public static void main(String[] args){
        greet("朝");
        greet("昼");
        greet("夜");
    }
    public static void greet(String time) {
        if (time == "朝") {
            System.out.println("Good morning!!");
        }
            
        if (time == "昼") {
            System.out.println("Good afternoon!!");
        }

        if (time == "夜"){
            System.out.println("Good evening!!");
        }
    }
}
 
 