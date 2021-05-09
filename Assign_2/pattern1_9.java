class Pattern_9
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{     int letter = 64;
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