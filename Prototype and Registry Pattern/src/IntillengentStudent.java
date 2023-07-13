public class IntillengentStudent extends Student{
    private int iq;
    public void setIq(int iq)
    {
        this.iq = iq;
    }
    public IntillengentStudent(){}
    private IntillengentStudent(IntillengentStudent s)
    {
        super(s);
        this.iq = s.iq;
    }

    @Override

    public IntillengentStudent clone()
    {
        return new IntillengentStudent(this);
    }

    public String toString()
    {
        return super.toString() + ", " + this.iq;

    }
}
