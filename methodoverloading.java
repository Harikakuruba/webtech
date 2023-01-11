class Demo1
{
  int x;
  double y;
 Demo1(int arg1)
{
  System.out.println("running int arg constructor");
  x=arg1;
}
Demo1(double arg1)
{
System.out.println("running double arg constructor");
y=arg1;
}
Demo1(int arg1,double arg2)
{
System.out.println("running int double arg constructor");
x=arg1;
y=arg2;
}
void display()
{
System.out.println("x value:"+x);
System.out.println("y value:"+y);
}
}
class 