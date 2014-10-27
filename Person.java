
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    // ATRIBUTOS
    private int age;
    private String name;

    /**
     * Constructor for objects of class Person
     */
    public Person(int personAge, String personName)
    {
        age = personAge;
        name = personName;
    }

    /**
     * METODOS
     */
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
}
