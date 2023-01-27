class GFG{
	static void hollowSquare(int rows){
       Scanner sc = new Scanner(System.in);
       String x= sc.nextLine();
		int i, j;
		for (i = 1; i <= rows; i++)
		{
			if (i == 1 || i == rows)
				for (j = 1; j <= rows; j++)
					System.out.print(x );
			else
				for (j = 1; j <= rows; j++)
					if (j == 1 || j == rows)
						System.out.print("*");
					else
						System.out.print(" ");
			System.out.print("\n");
		}
	}
	static void printPattern(int rows)
	{
		System.out.print("\nHollow Square:\n");
		hollowSquare(rows);
	}

	public static void main (String[] args)
	{
		int rows = 5;
		printPattern (rows);
	}
}


