public class TTTRunner
{
	public static int turns = 0;
	public static void main(String args[])
	{
		TTTGameTest game = new TTTGameTest();

		while(game.checkFinished() == false)
		{
			int row, col;
			if(turns % 2 == 0)
			{
				game.onePlay();
			}
			else
			{
				game.twoPlay();
			}
			turns++;
			System.out.println();
			game.displayBoard();
		}

	}

}
