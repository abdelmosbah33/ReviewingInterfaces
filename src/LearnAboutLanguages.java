public class LearnAboutLanguages {
	
	public static void teachLanguage(LanguageSpeaker speaker) {
		System.out.println("Hello, I speak " + speaker.GetMyLanguage());
		System.out.println("To say \"hello\", we say: " + speaker.GetHi());
		System.out.println("To say \"bye\", we say: " + speaker.GetBye());
		System.out.println();
	}
	
	public static void main(String[] args) {
		LanguageSpeaker australian = new EnglishSpeaker();
		LanguageSpeaker uruguayan  = new SpanishSpeaker();
		LanguageSpeaker mozambican = new PortugueseSpeaker();
		
		//TODO
		// LanguageSpeaker russian  = new RussianSpeaker();
		// LanguageSpeaker japanese = new JapaneseSpeaker();
		// LanguageSpeaker kenyan   = new SwahiliSpeaker();
		
		teachLanguage(australian);
		teachLanguage(uruguayan);
		teachLanguage(mozambican);
		
		//TODO
		//teachLanguage(russian);
		//teachLanguage(japanese);
		//teachLanguage(kenyan);
	}
}
