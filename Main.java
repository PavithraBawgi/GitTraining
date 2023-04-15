class a{
    public void run()
    {
        System.out.println("class a rum method");
    }

}
class b extends a{
    public void run1()
    {
        System.out.println("this is child class");
    }


}
class overloadingexample{
    void add(int a,int b){
        System.out.println(a+b);

    }
    void add(int a ,int b,int c){
        System.out.println(a+b+c);
    }
}
class overridingexample{
    void sub(){
        System.out.println("overriding example from parent class");
    }
}
class child extends overridingexample{
    void sub(){
        System.out.println("overriding example from child class");
    }
}
interface d{
    void run3();
}
class e implements d {
    public void run3() {
        System.out.println("Interface is implemented");
    }
}
abstract class f{
      abstract void run4();
}
class g extends f{
     void run4(){
         System.out.println("abstraction implemented using abstract class");
     }
}
class h{
    private int x;
    public int run5()
    {
        return x;
    }
    public void run6 (int x)
    {
        this.x=x;

    }
}
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        b b1=new b();
        b1.run();
        b1.run1();
        overloadingexample o=new overloadingexample();
        o.add(2,3);
        o.add(2,3,4);
        child c=new child();
        c.sub();
        overridingexample o1=new overridingexample();
        o1.sub();
        e e1=new e();
        e1.run3();
        g g1=new g();
        g1.run4();
        h h1=new h();
        h1.run6(100);
        System.out.println("number="+h1.run5());


    }
}