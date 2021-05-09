class Pattern_8
{
	public static void main(String[] args)
	{       int letter= 5;
		for(int i=1;i<=5;i++)
		{      letter = letter-1;
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}	
		
		
	
			for(int j=1;j<=i;j++)
			{
				System.out.print((letter+j)+" ");
			}	
			System.out.println();
		
		
		}
	}
}
//     5                  
//    4 5                
//   3 4 5               
//  2 3 4 5             
// 1 2 3 4 5         