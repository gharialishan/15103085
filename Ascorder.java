import java.util.Scanner;

public class Ascorder {
	public static void main(String args[]){
		int n;
		String temp= new String();
		System.out.println("Enter the number of names:");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		String names[]=new String[n];
		Scanner s= new Scanner(System.in);
		for(int i=0;i<n;i++){
			names[i]=s.nextLine();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(names[i].compareTo(names[j])>0)
				{
					temp = names[i];
					names[i] =names[j];
					names[j]=temp;
					}
				}
		}
		System.out.println("Names in ascending order:");
		for(int i=0;i<n;i++){
			System.out.println(names[i]);
			
		}
		sc.close();
		s.close();
		
	}

}
