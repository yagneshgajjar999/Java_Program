class OverAnimal
{
	void sound()
	{
		System.out.println("Animal make sound");
	}
}
class Dog extends OverAnimal
{
	void sound()
	{
		System.out.println("Dog make sound");
	}
}
class Overloading
{
	public static void main(String ar[])
	{
		OverAnimal d=new Dog();
		d.sound();
	}
}