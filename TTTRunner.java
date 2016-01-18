import java.util.Scanner;
public class TTTRunner
{
	public static int turns = 0;
	public static void main(String args[])
	{
		TTTGameTest game = new TTTGameTest();

		Scanner input = new Scanner(System.in);
		while(game.checkFinished() == false)
		{
			int row, col;
			if(turns % 2 == 0)
			{
				System.out.println("Player 1:");
				System.out.println("What row do you want to play in? ");
				row = input.nextInt();
				System.out.println("What column do you want to play in? ");
				col = input.nextInt();
				game.onePlay(row,col);
			}
			else
			{
				System.out.println("Player 2:");
				System.out.println("What row do you want to play in? ");
				row = input.nextInt();
				System.out.println("What column do you want to play in? ");
				col = input.nextInt();
				game.twoPlay(row,col);
			}
			turns++;
			System.out.println();
			game.displayBoard();
		}

	}

}
