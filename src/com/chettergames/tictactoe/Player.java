package com.chettergames.tictactoe;

public abstract class Player 
{
	public Player(int number, Game game, Board board)
	{
		this.number = number;
		this.game = game;
		this.board = board;
		if(number == 1) piece = new Piece(true);
		else piece = new Piece(false);
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
	public abstract void catsGame();
	
	public String getName(){return name;}
	public Piece getPiece(){return piece;}
	
	protected String name;
	protected int number;
	
	protected Game game;
	protected Board board;
	protected Piece piece;
}
