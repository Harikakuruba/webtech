class Demo1
{
int x=10;
void test()
{
System.out.println("running test() method");
}
}
class MainClass
{
public static void main(String [] args)
{
System.out.println("main method started");
Demo1 d1;
d1 = new Demo1();
System.out.println("x value is" + d1.x);
d1.test();
Demo1 d2 = new Demo1();
System.out.println("x value is" + d2.x);
d2.test();
}
}