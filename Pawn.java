package chess;
import chess.ChessDriver;

public class Pawn extends Peices implements Comparable<Peices>
{
	private boolean color = false;
	private int[] position = new int[2];
	@Override
	public boolean isValidMove(int[] a) 
	{
		if(a[0]!=position[0]) {return false;}
		if(position[1]==1&&((a[0]==position[0]&&a[1]>=3&&color)||!color&&(a[0]==position[0]&&a[1]<=5)))
		{
			return true;
		}else if(a[1]-1==position[1]) {
			return true;
		}
		return false;
	}
	Pawn(int x,int y,boolean color)
	{
		this.color=color;
		position[0]=x;
		position[1]=y;

	}
	public int[] getPos()
	{
		return position;
	}
	public boolean getColor() 
	{
		return color;
	}
	@Override
	public int compareTo(Peices o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setX(int x)
	{
		position[0]=x;
	}
	@Override
	public void setY(int y)
	{
		position[1]=y;
	}
	@Override
	public void setPos(int[] pos)
	{
		position = pos;
	}
}
