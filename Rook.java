package chess;

public class Rook extends Peices implements Comparable<Peices>
{
	private boolean color = false;
	private int[] position = new int[2];
	Rook(int x,int y,boolean color)
	{
		this.color=color;
		position[0]=x;
		position[1]=y;

	}
	@Override
	public boolean isValidMove(int[] a) 
	{
		if((a[0]==position[0]||a[1]==position[1]))
		{
			return true;
		}
		return false;
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
	public int compareTo(Peices o)
	{
		if(o.getClass() == Peices.class) return 0;
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
		if(color)return "R";
		return "r";
	}
}
