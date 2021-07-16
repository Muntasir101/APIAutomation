package JavaConcepts;

public class StaticMembers {
    //Static variable
    public static String name="Muntasir Abdullah";

    //No Static variable
    public int version=2;

    //static Method
    public static void printName(){
        System.out.println("Name is: "+name);
    }

    //Non static Method
    public void printVersion(){
        System.out.println("Version is : "+version);
    }

    public static void main(String[] args) {
        // Call static members with class name
        System.out.println(StaticMembers.name);
        StaticMembers.printName();

        //Creating an Object of Class. We can call members using object name
        StaticMembers sm=new StaticMembers();

        //Calling static member with object is not recommended
        System.out.println(sm.name);

        //Object name should be used to call non static members of class
        System.out.println(sm.version);
        sm.printVersion();

    }
}
