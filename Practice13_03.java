    
public class Practice13_03 {

	public static void main(String[] args) {

		/* Greetingクラスからインスタンスを生成する */
		Greeting greetJapan = new Greeting();
		Greeting greetKorea = new Greeting();
		Greeting greetUnknown = new Greeting();

		String japan = "日本";
    	String korea = "韓国";
    	String unknown = "その他";

		greetJapan.country = japan;
		greetKorea.country = korea;
		greetUnknown.country = unknown;

		System.out.println(greetJapan.country + "は " + greetJapan.greet(japan));
		/* 韓国、その他も同様に「System.out.println」を書く */
    	System.out.println(greetKorea.country + "は " + greetKorea.greet(korea));
		System.out.println(greetUnknown.country + "は " + greetUnknown.greet(unknown));
    }
}