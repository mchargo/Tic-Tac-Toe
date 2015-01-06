package com.chettergames.tictactoe;

public class Board 
{
	public Board()
	{
		pieces = new Piece[3][3];
	}
	
	public boolean catsGame()
	{
		for(int row=0; row<3; row++)
		{
			for(int col=0; col<3; col++)
			{
				if(pieces[row][col]==null)
				{
					return false;
				}
			}
			
		}
		return true;
	}
	
	public boolean gameOver()
	{
		return false;
	}
	
	public void placePiece(int row, int col, Piece piece)
	{
		pieces[row][col] = piece;
	}
	
	public Piece getPiece(int row, int col)
	{
		return pieces[row][col];
	}
	
	public void printToConsole()
	{
		for(int row = 0; row<3; row++)
		{
			System.out.print("|");
			for(int col = 0; col<3; col++)
			{
				if(pieces[row][col]==null)
				{
					System.out.print(" ");
				}else if(pieces[row][col].isX())
				{
					System.out.print("X");
				}else if(!(pieces[row][col].isX()))
				{
					System.out.print("O");
				}
				System.out.print("|");
			}
			System.out.println();
		}
	}
	
	private Piece[][] pieces;
}
