package JavaConcepts;

public class ImplementInterface1 implements I1{

    @Override
    public void printSomething() {
        System.out.println("Print Something from First Implementation");
    }

    @Override
    public void printAnything() {
        System.out.println("Print Anything from First Implementation");
    }
}
