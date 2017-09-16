import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]){
		
		
		System.out.println("Enter the number to print the prime numbers :");
		Scanner s= new Scanner(System.in);
		int nm = s.nextInt();
		System.out.println("Prime numbers are:");
         int i,j,p;
		for(i=2;i<nm;i++){
			j=0;
			for(p=2;p<i;p++)
			{
				if(i%p==0)
					j=1;	
		}
		if(j==0)
			System.out.println(i);
		}
		s.close();
		

}
}
