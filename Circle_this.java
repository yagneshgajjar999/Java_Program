class Circle 
{
    int x, y;
    int radius; 

    public Circle(int x, int y, int radius) 
	{
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
}
class Circle_this
{
    public static void main(String[] args) 
	{
        Circle c1 = new Circle(50, 50, 25);
        Circle c2 = new Circle(10, 10, 5);
        System.out.println(c1.x + "" + c1.y + "" + c1.radius);
        System.out.println(c2.x + "" + c2.y + "" + c2.radius);
    }
}
