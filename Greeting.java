class Greeting {
	
	String country ="nothing";
	
	public String greet(String country){
	    if (country == "日本"){
		    return "こんにちは";
		}
		else if (country == "韓国") {
			return "アンニョンハセヨ";
		}
		else {
			return "わかりません";
		}
		
	}
}