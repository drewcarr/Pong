import java.util.Scanner;
public class TTTGameTest
{
	//PlayerOne = X; PlayerTwo = O;
	public Scanner input = new Scanner(System.in);
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
	public void onePlay()
	{
		System.out.println("Player 1:");
		System.out.println("What row do you want to play in? ");
		row = input.nextInt();
		System.out.println("What column do you want to play in? ");
		col = input.nextInt();
		
		if(gameState[row][col] == null)
		{
			gameState[row][col] = "X";
		}
		else
		{
			System.out.println("That spot is taken try again");
			onePlay();
		}
	}
	public void twoPlay()
	{
		System.out.println("Player 2:");
		System.out.println("What row do you want to play in? ");
		row = input.nextInt();
		System.out.println("What column do you want to play in? ");
		col = input.nextInt();
		
		if(gameState[row][col] == null)
		{
			gameState[row][col] = "O";
		}
		else
		{
			System.out.println("That spot is taken try again");
			twoPlay();
		}
	}
}
