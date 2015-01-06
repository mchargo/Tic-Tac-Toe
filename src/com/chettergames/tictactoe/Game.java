package com.chettergames.tictactoe;

public class Game 
{
	public boolean doMove(int row, int col)
	{
		return true;
	}
	public void humanVsHuman()
	{
		player1 = new HumanPlayer();
		player2 = new HumanPlayer();
		board = new Board();
	}
	
	private Player player1;
	private Player player2;
	private Board board;

	public static void main(String[] args) 
	{
		
	}

}
