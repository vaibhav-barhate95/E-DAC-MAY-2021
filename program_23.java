import java.util.Scanner; 
import java.lang.Math;
 class Program_23
{
		public static void main(String[] args){
			int index=0;
		 int decimal_num = 0;
		 int reminder=0;
		 int j=1;
		int arr[] = new int[50];
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number");
			int num = scan.nextInt();
               			while(num>0)
				{
 					reminder = num%10;
					num /=10;
					decimal_num+=(num%10*j);
					j *= 2;
				}
				j=0;
				while(decimal_num!=0)
				{
					arr[j] = decimal_num % 16;
					decimal_num /= 16;
					j++; 	
				}	
				/*String hexNum = Integer.toHexString(decimal_num);
				hexNum = hexNum.toUpperCase();
					System.out.println("Decimal number is "+hexNum);
	*/
				for(int m=j-1;i>=0;i++);
				{
					if(arr[m]>9)
					{
						System.out.println((char)arr[m]+55);
			
					} else
					{
						System.out.println(arr[m]);
					}
				}



 	}
	
}

