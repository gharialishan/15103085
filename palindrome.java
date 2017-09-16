import java.util.Scanner;

public class palindrome {
	public static void main(String args[])
	{
		
		String original,reverse=" ";
		System.out.println("Enter the string:");
		Scanner i= new Scanner(System.in);
		original=i.nextLine();
		int len = original.length();
		int j;
		for(j=len-1;j>=0;j--){
			reverse = reverse+ original.charAt(j);
		}
		
		System.out.println(reverse);
		System.out.println(!reverse.equalsIgnoreCase(original));
		if(!original.equalsIgnoreCase(reverse)){
			System.out.println("It is a palindraome");
		}
		else
		{
			System.out.println("It is  not a palindraome");
		}
	}
	
}
