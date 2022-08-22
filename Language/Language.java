public class Language{
	
	protected String name;
	protected int numSpeakers;
	protected String regionsSpoken;
	protected String wordOrder;
	
	public Language(String langName, int speakers, String regions, String wdOrder) {
		this.name = langName;
		this.numSpeakers = speakers;
		this.regionsSpoken = regions;
		this.wordOrder = wdOrder;
	}
	
	public void getInfo() {
		System.out.println(name + "is spokeb by " + numSpeakers + "people mainly in " + regionsSpoken);
		System.out.println("The language follows the word order " + wordOrder);
	}
	
	public static void main(String[] args) {
		Language language = new Language("Spanish", 555000000, "spain, latinAmerica, and Equatorial Guinea", "subject-Verb-object" );
		language.getInfo();
		
		Mayan kiche = new Mayan("ki'che'", 2330000);
		kiche.getInfo();
		
		SinoTibetan Chinese = new SinoTibetan("Mandarin Chinese", 1300000000);
		Chinese.getInfo();
		
		SinoTibetan foreign = new SinoTibetan("Burmese",54829255);
		Chinese.getInfo();
	}
	
}