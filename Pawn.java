package chess;

public class Pawn extends Pieces implements Comparable<Pieces>
{
	private boolean color = false;
	private int[] position = new int[2];
	@Override
	public boolean isValidMove(int[] a) 
	{
		if(color) {
			if(position[1]==6&&(a[1]+1==position[1]||a[1]+2==position[1]))
			{
				return true;
			}
			else if(a[1]+1==position[1]) 
			{
				return true;
			}
		}
		else {
			if(position[1]==1&&(a[1]-1==position[1]||a[1]-2==position[1]))
			{
				return true;
			}
			else if(a[1]-1==position[1]) 
			{
				return true;
			}
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
	public int compareTo(Pieces o)
	{
		if(o.getClass() == Pieces.class) return 0;
		if(o.getColor()==this.getColor()) 
		{
			return 1;
		}
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
	@Override
	public String getClassChar() 
	{
		if(color)return "P";
		return "p";
	}
}
