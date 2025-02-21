package Day_1;

public class Reverse_String {

	public static void main(String[] args) {
	      
        String s = "HelloWorld"; 
        String r = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {
              
            ch = s.charAt(i);
            r = ch + r; 
        }
      
        System.out.println(r);
    }
}
