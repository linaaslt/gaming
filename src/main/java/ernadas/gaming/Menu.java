package ernadas.gaming;

public enum Menu {

	Kurejas("/kurejas")
	, Platforma("/platforma")
	, Zaidimai("/zaidimai");
	
	private final String itemurl;
	
	Menu( String url ) {
		this.itemurl = url;
	}
	
	public String itemurl() {
		return this.itemurl;
	}
	
}
