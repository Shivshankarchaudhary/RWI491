public class ReverseString {
    public static void main(String[] args) {
        String name="Virat";
        int len=name.length();
        String ans="";

        for(int i=len-1; i>=0; i--){
            ans+=name.charAt(i);
        }

        System.out.println(ans);
    }
}
