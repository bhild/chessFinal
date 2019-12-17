package chess;

public class King extends Peices implements Comparable<Peices>
{
	private boolean color = false;
	private int[] position = new int[2];
	@Override
	public boolean isValidMove(int[] a) 
	{
		boolean yT = false;
		boolean xT = false;
		if(a[0]==position[0]||a[0]-1==position[0]||a[0]+1==position[0]) xT=true;
		if(a[1]==position[1]||a[1]-1==position[1]||a[1]+1==position[1]) yT=true;
		System.out.println(a[0]+"\t"+a[1]);
		return xT&&yT;

	}

	King(int x,int y,boolean color)
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
		if(color)return "K";
		return "k";
	}
}
