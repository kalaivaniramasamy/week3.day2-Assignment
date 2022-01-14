package week3.day2;

public class Automation extends MultipleLanguage implements Language,TestTool {
	
	// public class Automation extends MultipleLangauge implements Language, TestTool{

	public static void main(String[] args) {
		
		Automation auto = new Automation();
		auto.Java();
		auto.python();
		auto.Selenium();
		auto.ruby();
		
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium Class");
		
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java Class");
		
	}
}
