abstract class Mac
{
	abstract void YellowRed();
}
class vip extends Mac
{
	public static void main(String ar[])
	{
		vip v = new vip();
		v.YellowRed();
	}
	void YellowRed()
	{
		System.out.println("Color Implemented");
	}
}