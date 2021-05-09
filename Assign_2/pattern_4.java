class Pattern_4
{
	public static void main(String[] args)
	{
		
		int v=0;	
		for(int i=1;i<=9;i++)
		{      v+=1;
			for(int j=9;j>=i;j--)
			{
				System.out.print(" ");
			}	
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}	
			/*for(int l =v;l<i;l++)
			{
				System.out.print(l);
			}	
			*/
			System.out.println();
			
		}
	}
}     

//           1
//          1 2
//         1 2 3
//        1 2 3 4
//       1 2 3 4 5
//      1 2 3 4 5 6
//     1 2 3 4 5 6 7
//    1 2 3 4 5 6 7 8
 //  1 2 3 4 5 6 7 8 9