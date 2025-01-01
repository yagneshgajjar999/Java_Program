class ExceptionDemo
{
    public static void main(String ar[])
    {
        System.out.println("Starting");
        int a = 20,b=10,c;
        int arr[] = {10,20,30};
        try
        {
            c=a/b;
            System.out.println("Div:"+c);
            System.out.println("Arr:"+arr[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can't devide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Exception");
        }
        System.out.println("Running");
    }
}