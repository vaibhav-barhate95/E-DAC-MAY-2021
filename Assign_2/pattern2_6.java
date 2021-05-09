class Pattern_6
{
	public static void main(String[] args)
	{
		int l=9;
	
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}	
			for(int k=1;k<=l;k++)
			{
				System.out.print("*");
			}	
				l=l-2;
			
			System.out.println();
			
		}
	}
}     
//  *********               
//   *******                
//    *****              
//     ***             
//      *     