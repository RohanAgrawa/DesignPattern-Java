public class Student implements Prototype<Student>{

    private String name;
    private int psp;

    private String batch;

    private int age;

    private int avg_psp;

    public void setName(String name)
    {
        this.name = name;
    }

    public void  setAge(int age)
    {
        this.age = age;
    }

    public void setAvg_psp(int avg_psp)
    {
        this.avg_psp = avg_psp;
    }
    public void setPsp(int psp)
    {
        this.psp = psp;
    }

    public void setBatch(String batch)
    {
        this.batch = batch;
    }

    public  Student(){}

    public Student(Student s)
    {
        this.name = s.name;
        this.psp = s.psp;
        this.avg_psp = s.avg_psp;
        this.batch = s.batch;
        this.age = s.age;
    }

    public Student clone()
    {
        return new Student(this);
    }


    public String toString()
    {
        return this.name + ", " + this.avg_psp + ", " + this.psp + ", " + this.batch + ", " +this.age;
    }
}
