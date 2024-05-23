final class Car{
   void color(){
     System.out.println("Color of the car is Red");
   }
}

public class FinalClass extends Car {
    void run(){
        System.out.println("Running");
    }
    public static void main(String[] args) {
        FinalClass obj=new FinalClass();
        obj.run();
    }
}
