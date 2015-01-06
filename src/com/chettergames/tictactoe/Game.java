package com.chettergames.tictactoe;

import java.util.Scanner;

public class Game 
{
	public boolean doMove(int row, int col)
	{
		return true;
	}
	public void humanVsHuman()
	{
		board = new Board();
		player1 = new HumanPlayer(1, this, board);
		player2 = new HumanPlayer(2, this, board);
	}
	
	public static Scanner scanner;
	
	private Player player1;
	private Player player2;
	private Board board;

	public static void main(String[] args) 
	{
		scanner = new Scanner(System.in);
		Game game = new Game();
		game.humanVsHuman();
	}
}
