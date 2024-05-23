public class FinalVariable {
    final int x=10;
    final double py=3.14;

    public static void main(String[] args) {
        FinalVariable obj= new FinalVariable();
        obj.x=24;   // it will generate an error: cannot assign a value to final variable x
        obj.py=3.99; // it will generate an error: cannot assign a value to    final variable py
        System.out.println(obj.x);
        System.out.println(obj.py);
    }
}
