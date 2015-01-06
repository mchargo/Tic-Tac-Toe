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
			System.out.print("Please enter the row you would like to place your piece in? ");
			while(!Game.scanner.hasNextInt())Game.scanner.nextLine();
			int row = Game.scanner.nextInt();
			System.out.print("Please enter the column you would like to place your piece in? ");
			while(!Game.scanner.hasNextInt())Game.scanner.nextLine();
			int col = Game.scanner.nextInt();
			if(game.doMove(row, col)==false)
			{
				System.out.println("Invalid move. Please try again");
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
