class Animal
{
	void legs()
	{
		System.out.println("4 legs");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking");
	}
	public static void main(String ar[])
	{
		Dog d=new Dog();
		d.legs();
		d.bark();
	}
}