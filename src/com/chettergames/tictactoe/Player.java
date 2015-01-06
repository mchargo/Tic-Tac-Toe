package com.chettergames.tictactoe;

public abstract class Player 
{
	public Player(int number, Game game, Board board)
	{
		this.number = number;
		this.game = game;
		this.board = board;
	}
	
	public void prepareForNewGame()
	{
		new Thread(new Runnable()
		{
			public void run()
			{
				promptForName();
			}
		}).start();;
	}
	
	public abstract void promptForName();
	public abstract void myTurn();
	public abstract boolean isReady();
	
	public abstract void youWon(String otherPlayer);
	public abstract void youLost(String otherPlayer);
	
	public String getName(){return name;}
	
	protected String name;
	protected int number;
	
	protected Game game;
	protected Board board;
}
