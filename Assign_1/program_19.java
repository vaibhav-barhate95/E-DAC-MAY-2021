import java.util.Scanner;
 class Program_19
{
		public static void main(String[] args){
			int index=0;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number");
			int arr[] = new int[5];
			
			
			int num = scan.nextInt();
					
					while(num>0)
					{
						arr[index++] = num%2;
						num /= 2; 
					}
				
					for(int i=index-1;i>=0;i--)
					{
						System.out.print(arr[i]+" ");
					}
	
	}
	
}