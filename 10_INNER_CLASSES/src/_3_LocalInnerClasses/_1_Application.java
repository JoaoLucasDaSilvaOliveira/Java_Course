package _3_LocalInnerClasses;

public class _1_Application {

    public void greet (){
        class Greter{
            public void sayHi(){
                System.out.println("Hi");
            }
        }
            Greter greter = new Greter();
            greter.sayHi();
    }
}
