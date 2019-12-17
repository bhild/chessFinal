package chess;

public class Peices implements Comparable<Peices>
{
	
	private boolean color = false;
	//false == balck
	//true == white
	private int[] position = new int[2];
	//value 0 is col 
	//value 1 is row
	public boolean isValidMove(int[][] a) 
	{
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
	public Peices() {
		
	}
	public boolean isValidMove(int[] a) {
		return false;
	}
	public void setX(int x)
	{
		position[0]=x;
	}
	public void setY(int y)
	{
		position[1]=y;
	}
	public void setPos(int[] pos)
	{
		position = pos;
	}
	public String getClassChar() {
		return "-";
	}
	public int compareTo(Peices o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
