
public class HowToRemoveSpacesInString {

	public static void main(String[] args) {
		String frameWork = "Java Selenium TestNG Mevan ";
		
		frameWork=frameWork.replaceAll("\\s", "");
		
		System.out.println(frameWork);
		

	}
}

       /********
        * 2 way with count of spaces
        * String s = "Java Selenium TestNG Mevan ";
		int a=s.length();
		s=s.replaceAll("\\s", "");
		int b=s.length();
		System.out.println(s);
		int count=a-b;
		System.out.println(count);
		*/
