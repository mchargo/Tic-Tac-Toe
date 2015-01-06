package com.chettergames.tictactoe;

public class Board 
{
	public Board()
	{
		pieces = new Piece[3][3];
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
