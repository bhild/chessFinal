package chess;

public class Knight extends Peices implements Comparable<Peices>
{
	private boolean color = false;	
	private int[] position = new int[2];
	private int numPeice;
	@Override
	public boolean isValidMove(int[] a) 
	{
		return false;
	}

	Knight(int x,int y,boolean color)
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
