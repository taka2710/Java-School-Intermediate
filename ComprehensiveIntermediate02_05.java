public class ComprehensiveIntermediate02_05 {
    public static void main(String[] args) {
        Juice juice = new Juice();
        Coffee coffee = new Coffee();
        // Juiceクラスの自動販売機の表示
        juice.buyDrink("バヤリース", "オレンジ", "130");
        juice.buyDrink("午後の紅茶", "レモンティー", "150");
        // Coffeeクラスの自動販売機の表示
        coffee.buyDrink("ボス", "控え目", "無し", "110");
        coffee.buyDrink("ジョージア", "甘め", "入り", "120");
            
    }
    
}   
