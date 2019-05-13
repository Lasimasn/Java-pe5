package com.stackroute.pe5;

import java.io.PrintStream;
import java.util.*;

public class Student {

    private String id;
    private String name;
    private int age;

    public Student(String name, String id,int age)//Constructor
    {
        this.name=name;
        this.age=age;
        this.id=id;
    }
    //Getter method for name
    public String getName()
    {
        return name;
    }
    //Setter Method for name
    public void setName(String name)
    {
        this.name=name;
    }
    //Getter method for age
    public int getAge()
    {
        return age;
    }
    //Setter Method for age
    public void setAge(int age)
    {
        this.age=age;
    }//Getter method for id
    public String getId()
    {
        return id;
    }
    //Setter Method for id
    public void setId(String id)
    {
        this.id=id;
    }

}
    class MainTest {
        public static void main(String args[]) {
            ArrayList<Student> array = new ArrayList<Student>();
            MainTest mainTest = new MainTest();

            Student student = new Student("Abhai", "20", 21);
            Student student1 = new Student("Rakhi", "29", 20);
            Student student2 = new Student("Misha", "21", 19);
            Student student3 = new Student("Zayn", "23", 22);
            Student student4 = new Student("Harry", "98", 21);
            //student.getClass( new Student("juio",20,99));
            array.add(student);
            array.add(student1);
            array.add(student2);
            array.add(student3);
            array.add(student4);

            Iterator<Student> iterator = array.iterator();//prints the list before sorting
            while (iterator.hasNext()){
                Student student5=(Student)iterator.next();
                System.out.println(student5.getName()+" "+student5.getAge()+" "+student5.getId());
            }

            Collections.sort(array,new StudentSorter());

            System.out.println(("\n\nThe sorted list is : \n"));
            for (int i = 0; i < array.size(); ++i) {

                PrintStream var1 = System.out;
                String var2 = ((Student) array.get(i)).getId();
                var1.println(var2 + " " + ((Student) array.get(i)).getName() + " " + ((Student) array.get(i)).getAge());

            }


            }

        }

        class StudentSorter implements Comparator<Student> {

            @Override
            public int compare(Student s1, Student s2) {
                //int comparison=0;
                if(s1.getAge()==s2.getAge())
                {
                    if(s1.getName().equalsIgnoreCase(s2.getName()))
                        return s1.getId().compareTo(s2.getId());
                    else
                        return s1.getName().compareTo(s2.getName());
                }
                else
                {
                    return s2.getAge()-s1.getAge();
                }

            }
        }
