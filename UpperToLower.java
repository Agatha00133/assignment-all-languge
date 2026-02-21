public class UpperToLower {
    public static void main(String... args) {
        String name= "HELLO World!";
        String result = "";

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);

      
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + ('a' - 'A'));
 }

            result += c; 
 }

        System.out.println("Lowercase: " + result);
    }
}
