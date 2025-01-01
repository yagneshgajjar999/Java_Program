interface A
{
	default void show()
	{
		System.out.println("A");
	}
}
interface B 
{
	default void show()
	{
		System.out.println("B");
	}
}
class C implements A,B
{
	public static void main(String ar[])
	{
		C ob=new C();
		ob.show();
	}
	public void show()
	{
		A.super.show();
		B.super.show();
	}
} 