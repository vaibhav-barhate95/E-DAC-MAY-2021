class Pattern_2{
		public static void main(String[] args){
			int letter = 64;
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print((char)(letter+j));
				}
				System.out.println();
			}
		}
}



//   A
//   AB
//   ABC
//   ABCD
//   ABCDE
