package com.chettergames.tictactoe;

public class Piece 
{
	public Piece(boolean isX)
	{
		this.isX = isX;
	}
	
	public boolean isX()
	{
		return isX;
	}
	
	public void setIsX(boolean isX)
	{
		this.isX = isX;
	}
	
	private boolean isX;
}
