public class LetterE {
    public static void main(String... args) {
        String name = "Appears in Everything";
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'e' || name.charAt(i) == 'E') {
                count++;
        }
        }

        System.out.println("Number of 'e's: " + count);
}
}
