class Pattern_18{
		public static void main(String[] args){
			
			for(int i=1;i<=5;i++)
			{
				int letter = 64;

				for(int j=5;j>=i;j--)
				{
					letter += 1;
					System.out.print((char)(letter)+" ");
				}
				System.out.println();
			}
		}
}

//A B C D E
//A B C D
//A B C
//A B
//A
