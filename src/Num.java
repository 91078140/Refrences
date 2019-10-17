public class Num
{
    private int value;

    public Num(int update)
    {
        value = update;
    }// end of constructor

    public int getValue()
    {
        return value;
    }// end of getter

    public void setValue(int update)
    {
        value = update;
    }// end of setter

    public String toString()
    {
        return value + "";
    }// end of toString
}// end of class num