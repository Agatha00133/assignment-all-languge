public class LowerToUpper {
    public static void main(String...args) {
        String name = "Hello World!"; 
        String result = "";

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);

         
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - ('a' - 'A'));
            }

            result += c;
}

        System.out.println("Uppercase: " + result);
}
}
