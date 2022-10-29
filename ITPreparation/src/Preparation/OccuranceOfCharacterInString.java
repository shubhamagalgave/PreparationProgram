package Preparation;

public class OccuranceOfCharacterInString
{

	public static void main(String[] args)
	{
		String s="shubhamagalgave";
		int total=s.length();
		System.out.println(total);
		int count = s.replace("a", "").length();
		System.out.println(count);
		int occurance=total-count;
		System.out.println("Occurance of a :"+occurance);
	}

}
