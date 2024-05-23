public class Car{
  final void run(){
    System.out.println("Running");
  }
    
}

public class FinalMethod extends Car{
    void run(){
      System.out.println("Sohan is driving this car");
    }
    public static void main(String[] args) {
        FinalMethod obj=new FinalMethod();
        obj.run(); // error:run() in FinalMethod cannot override run() in Car void run();
    }
}
