
public class Person
{
    public static int instanceCount;
    public int localCount;
    public Person(){
        instanceCount++;
        localCount++;
    }

    public static void main(String[] args)
    {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        // Print the values of both counters
        System.out.println("(" + person4.localCount + "," + Person.instanceCount + ")");


    }

}

