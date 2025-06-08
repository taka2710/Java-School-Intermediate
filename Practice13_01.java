class animal {
    String name = "Jhon";
    String type = "nothing";

    /**
     * 動物に合わせて鳴き声を出力するメソッド
     * 
     * @param type   引数1 | str 
     *
    */
    public void cryAnimals(String type) {
        System.out.println(
            switch (type) {
                case "cat" -> "nya-";
                case "dog" -> "wan";
                default -> "特定できませんでした";
            }
        );
    }
}

    public class Practice13_01 {
        public static void main(String[] args) {
            animal a001 = new animal();
            a001.name = "pochi";
            System.out.println(a001.name);
            a001.cryAnimals("dog");

            animal a002 = new animal();
            a002.name = "tama";
            System.out.println(a002.name);
            a002.cryAnimals("cat");
        }
    
}
