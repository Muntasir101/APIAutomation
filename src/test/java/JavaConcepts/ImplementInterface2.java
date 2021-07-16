package JavaConcepts;

public class ImplementInterface2 implements I1{

    @Override
    public void printSomething() {
        System.out.println("Print Something from Second Implementation");
    }

    @Override
    public void printAnything() {
        System.out.println("Print Anything from Second Implementation");
    }
}
