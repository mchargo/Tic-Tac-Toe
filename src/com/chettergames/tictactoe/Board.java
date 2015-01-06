package com.chettergames.tictactoe;

public class Board 
{
	public Board()
	{
		pieces = new Piece[3][3];
	}

	public boolean catsGame()
	{
		return false;
	}

	public boolean gameOver()
	{
		if(playerWon(new Piece(true))
				|| playerWon(new Piece(false)))
			return true;
		return false;
	}

	public boolean playerWon(Piece piece)
	{
		int row = 0;
		int col = 0;

		for(row = 0;row < 3; row++)
		{
			boolean win = false;
			for(col = 0;col < 3;col++)
			{
				win = false;
				if(pieces[row][col] == null) break;
				if(pieces[row][col].isX() != piece.isX()) break;
				win = true;
			}
			if(win) return true;
		}

		for(col = 0;col < 3; col++)
		{
			boolean win = false;
			for(row = 0;row < 3;row++)
			{
				win = false;
				if(pieces[row][col] == null) break;
				if(pieces[row][col].isX() != piece.isX()) break;
				win = true;
			}
			if(win) return true;
		}

		boolean win = false;
		for(int x = 0;x < 3;x++)
		{
			win = false;
			if(pieces[x][x] == null) break;
			if(pieces[x][x].isX() != piece.isX()) break;
			win = true;
		}

		if(win) return true;

		win = false;
		for(int x = 0;x < 3;x++)
		{
			win = false;
			if(pieces[x][2 - x] == null) break;
			if(pieces[x][2 - x].isX() != piece.isX()) break;
			win = true;
		}

		if(win) return true;
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
