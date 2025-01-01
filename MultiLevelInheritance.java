class Animals
{
	void legs()
	{
		System.out.println("4 legs");
	}
}
class Dog extends Animals
{
	void bark()
	{
		System.out.println("Barking");
	}
}
class Cat extends Dog
{
	void meow()
	{
		System.out.println("Chin tapak dum dum");
	}
}
class MultiLevelInheritance
{
	public static void main(String ar[])
	{
		Cat c=new Cat();
		c.legs();
		c.bark();
		c.meow();
	}
}