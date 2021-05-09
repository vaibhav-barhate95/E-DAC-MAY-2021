class Pattern_6{
 	
		public static void main(String[] args){
		
 			for (int i=1;i<=9;i++){
				for(int j=1;j<=i-1;j++)
				{
					System.out.print(" ");
				}
				for(int k=0;k<=9-i;k++)
				{
					System.out.print("* ");
				}
				
			System.out.println();
			}
		}
}
