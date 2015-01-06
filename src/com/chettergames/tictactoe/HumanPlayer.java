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
	public void myTurn() {}

	@Override
	public boolean isReady() 
	{
		return name != null;
	}

	@Override
	public void youWon(String otherPlayer) {}

	@Override
	public void youLost(String otherPlayer) {}

}
