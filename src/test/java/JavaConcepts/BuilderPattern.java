package JavaConcepts;

//Method Chaining

public class BuilderPattern {
    //Change return type of each method as Class type
    // "this" always point of current/calling object.
    public BuilderPattern M1(){
        System.out.println("M1");
        return this;
    }
    public BuilderPattern M2(String str){
        System.out.println("Pass String is: "+str);
        return this;
    }
    public BuilderPattern M3(){
        System.out.println("M3");
        return this;
    }

    public static void main(String[] args) {
        BuilderPattern bp=new BuilderPattern();
        bp
                .M1()
                .M2("Test")
                .M3();
    }
}
