class Pattern_13
{
	public static void main(String[] args)
	{   int letter = 64;
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}	
		
		
	
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(letter+i)+" ");
			}	
			System.out.println();
		
		
		}  
	}
}

//     1
//    1 2
//   1 2 3
//  1 2 3 4
// 1 2 3 4 5