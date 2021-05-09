class Pattern_10
{
	public static void main(String[] args)
	{       int letter= 69;
		for(int i=1;i<=5;i++)
		{      letter = letter-1;
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}	
		
		
	
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(letter+j)+" ");
			}	
			System.out.println();
		
		
		}
	}
}
//     A                   
//    A B                
//   A B C               
//  A B C D             
// A B C D E         