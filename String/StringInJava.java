public class StringInJava {
   public static void main(String[] args) {
       String name="Ramesh";

       // printing the value of every index in java
       for(int i=0; i<name.length(); i++){
          System.out.print("value at index "+ i+"-> ");
          System.out.println(name.charAt(i));
       }
       
   }
    
}