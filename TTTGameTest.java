public class TTTGameTest
{
	//PlayerOne = X; PlayerTwo = O;
	public String[][] gameState = new String[3][3];
	public TTTGameTest()
	{
		for(int x = 0; x <=2; x++)
		{
			for(int y = 0; y <= 2; y++)
			{
				gameState[x][y] = null;
			}
		}
		displayBoard();
	}
	public void displayBoard()
	{
		for(int x = 0; x <= 2; x++)
		{
			for(int y = 0; y <= 2; y++)
			{
				if(gameState[x][y] == null)
				{
					System.out.print("   ");
				}
				else
				{
					System.out.print(" " + gameState[x][y] + " ");
				}
				if(y <2)
				{
					System.out.print("|");
				}
			}
			System.out.println();
			if(x <2)
			{
				System.out.println("-----------");
			}
		}
		System.out.println();
	}
	public boolean checkFinished()
	{
		return false;
	}
	public void onePlay(int row, int col)
	{
		if(gameState[row][col] == null)
		{
			gameState[row][col] = "X";
		}
		else
		{
			System.out.println("You tried to go where there was already a peice and lost your turn");
		}
	}
	public void twoPlay(int row, int col)
	{
		if(gameState[row][col] == null)
		{
			gameState[row][col] = "O";
		}
		else
		{
			System.out.println("You tried to go where there was already a piece and lost your turn");
		}
	}
}
