package com.chettergames.tictactoe;

public class HumanPlayer extends Player
{
	public HumanPlayer(int number, Game game, Board board) 
	{
		super(number, game, board);
	}

	public void prepareForGame()
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
			int row = Game.scanner.nextInt();
			System.out.print("Please enter the column you would like to place your piece in? ");
			int col = Game.scanner.nextInt();
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
	public void youWon(String otherPlayer) {}

	@Override
	public void youLost(String otherPlayer) {}

	@Override
	public void catsGame() {}
}
