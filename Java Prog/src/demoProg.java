import javax.swing.text.AttributeSet.CharacterAttribute;

public class demoProg {

	public static void main(String[] args)
	{
		String s1 = "Character";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
			
		System.out.println(s2);
		System.out.println("========================");
		
		System.out.println(reverseString(s1));
	}
	
	public static String  reverseString(String s1)
	{
		char[] ch = s1.toCharArray();
		String rev = "";
		
		for(int i =ch.length-1;i>=0;i--)
		{
			rev+=ch[i];
		}
		
		
		return rev;
		
	}
}
