class Employee
{
    int id;
    String name;
    double salary;

    


    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void details()
    {
        System.out.println("Id: "+id  +"Name: " + name  + "salary: "+ salary);
    }
}
class Constructor
{
    public static void main(String args[])
    {

        Employee e1=new Employee(1234,"harika",600000);
        e1.details();
    }
}