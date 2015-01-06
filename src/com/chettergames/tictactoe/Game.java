package com.chettergames.tictactoe;

import java.util.Scanner;

public class Game 
{
	public boolean doMove(int row, int col)
	{
		if(row < 0 || row > 2 || col < 0 || col > 2)
			return false;
		Piece playerPiece = currentPlayer.getPiece();
		
		if(board.getPiece(row, col) == null)
		{
			board.placePiece(row, col, playerPiece);
			return true;
		}
		
		return false;
	}
	
	public void humanVsHuman()
	{
		board = new Board();
		player1 = new HumanPlayer(1, this, board);
		player2 = new HumanPlayer(2, this, board);
	}
	
	public void readyPlayers()
	{
		player1.prepareForNewGame();
		player2.prepareForNewGame();
		
		while(!player1.isReady() || !player2.isReady())
		{
			try
			{
				Thread.sleep(100);
			}catch(Exception e){e.printStackTrace();}
		}
	}
	
	public void playGame()
	{
		while(true)
		{
			currentPlayer = player1;
			
			player1.myTurn();
			if(board.gameOver())
			{
				player1.catsGame();
				player2.catsGame();
				break;
			}else if(board.gameOver())
			{
				player1.youWon(player2.getName());
				player2.youLost(player1.getName());
				break;
			}
			
			currentPlayer = player2;
			player2.myTurn();			
			if(board.gameOver())
			{
				player1.catsGame();
				player2.catsGame();
				break;
			}else if(board.catsGame())
			{
				player2.youWon(player1.getName());
				player1.youLost(player2.getName());
				break;
			}
		}
	}
	
	public static Scanner scanner;
	
	private Player player1;
	private Player player2;
	private Player currentPlayer;
	private Board board;

	public static void main(String[] args) 
	{
		scanner = new Scanner(System.in);
		Game game = new Game();
		game.humanVsHuman();
		game.readyPlayers();
		game.playGame();
	}
}
