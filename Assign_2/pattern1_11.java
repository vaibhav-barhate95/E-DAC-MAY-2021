class Pattern_11
{
	public static void main(String[] args)
	{
		int l=1;	
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}	
			for(int k=1;k<=l;k++)
			{
				System.out.print("*");
			}	
				l=l+2;
			System.out.println();
			
		}
	}
}     
//     *                
//    ***                
//   *****               
//  *******             
// *********       