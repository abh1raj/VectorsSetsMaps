import java.util.*;
class Student
{
	private int id;
	private String name;
	Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	String retName()
	{
		return name;
	}
	int retId()
	{
		return id;
	}

}
public class hashm
{
	public static void main(String args[])
	{
		Map<Integer,Student> m = new HashMap<>();
		m.put(1,new Student(1,"naruto"));
		m.put(2,new Student(2,"sasuke"));
		m.put(3,new Student(3,"MADARA"));
		m.put(4,new Student(4,"itachi"));
		 
		for(Map.Entry<Integer, Student> e : m.entrySet())
		{  

        int key = e.getKey();  
        Student b = e.getValue();  

        System.out.print("Key : "+key);  
        System.out.println(" ID : "+b.retId()+" NAME -> "+b.retName());   
    }    

	}
}