package JavaConcepts;

import static JavaConcepts.StaticMembers.*;
import static JavaConcepts.NonBuilderPattern.*;

public class WithStaticImport {

    public static void main(String[] args) {
       //No need to Use Class name to call static members, StaticMembers Class
        System.out.println(name);
        printName();

        //Builder pattern class Instance
        BuilderPattern bp=new BuilderPattern();
       bp .M1()
          .M2("Test")
          .M3();

       //Non Builder pattern class member
        M4();

    }
}
