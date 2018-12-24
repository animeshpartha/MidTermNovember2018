package design;

public abstract class AbstractClass implements Employee{

    final String empName = "John Smith";
    static String resignationDate = "01/01/2010";

    public void farewell () {
        System.out.println(empName+"'s last day was"+resignationDate);
    }
    public abstract void farewell (int date);

}