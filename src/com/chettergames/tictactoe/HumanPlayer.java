package com.chettergames.tictactoe;

public class HumanPlayer extends Player
{
	public HumanPlayer(int number, Game game, Board board) 
	{
		super(number, game, board);
	}

	@Override
	public void prepareForNewGame()
	{
		System.out.print("Player " + number + " name: ");
		name = Game.scanner.nextLine();
	}

	@Override
	public void promptForName() {}

	@Override
	public void myTurn() 
	{
		board.printToConsole();
		boolean moveValid = false;
		while(moveValid==false)
		{
			System.out.println("Player " + number + " it is your turn.");
			System.out.println("Please enter the row you would like to place your piecein ?");
			int row = game.scanner.nextInt();
			System.out.println("Please enter the column you would like to place your piece in?");
			int col = game.scanner.nextInt();
			if(game.doMove(row, col)==false)
			{
				System.out.print("Invalid move. Please try again");
			}else{
				moveValid = true;
			}
		}
	}

	@Override
	public boolean isReady() 
	{
		return name != null;
	}

	@Override
	public void youWon(String otherPlayer) 
	{
		System.out.println(name + " has won the game!");
	}

	@Override
	public void youLost(String otherPlayer) 
	{
		System.out.println(name + " has lost the game!");
	}

	@Override
	public void catsGame() 
	{
		System.out.println("Cats game!");
	}
}
