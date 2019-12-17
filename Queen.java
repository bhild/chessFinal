package chess;

public class Queen extends Peices implements Comparable<Peices>
{
	private boolean color = false;
	private int[] position = new int[2];
	@Override
	public boolean isValidMove(int[] a) 
	{
		for(int i =0;i<8;i++) 
		{
			for(int j=0;j<8;j++) 
			{
				if(a[0]==i&&a[1]==j)
				{
					return true;
				}
			}
		}
		if(a[0]==position[0]||a[1]==position[1])
		{
			return true;
		}
		return false;
	}
	Queen(int x,int y,boolean color)
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
