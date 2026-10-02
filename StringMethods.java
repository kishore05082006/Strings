public class Main {
    public static void main(String[] args) {
        String s = "  Hello Java World  ";
        String t = s.trim();

        System.out.println("1. length: " + s.length());
        System.out.println("2. charAt(1) of trimmed: " + t.charAt(1));
        System.out.println("3. substring(6, 10): " + t.substring(6, 10));
        System.out.println("4. indexOf('o'): " + t.indexOf('o'));
        System.out.println("5. lastIndexOf('o'): " + t.lastIndexOf('o'));
        System.out.println("6. equals: " + t.equals("Hello Java World"));
        System.out.println("7. equalsIgnoreCase: " + t.equalsIgnoreCase("hello java world"));
        System.out.println("8. compareTo(\"Hello\"): " + t.compareTo("Hello"));
        System.out.println("9. concat: " + t.concat("!!!"));
        System.out.println("10. contains(\"Java\"): " + t.contains("Java"));
        System.out.println("11. startsWith(\"Hello\"): " + t.startsWith("Hello"));
        System.out.println("12. endsWith(\"World\"): " + t.endsWith("World"));
        System.out.println("13. toUpperCase: " + t.toUpperCase());
        System.out.println("14. toLowerCase: " + t.toLowerCase());
        System.out.println("15. trim: [" + s.trim() + "]");
        System.out.println("16. replace('a','@'): " + t.replace('a', '@'));

        String[] words = t.split(" ");
        System.out.print("17. split: ");
        for (String w : words) {
            System.out.print("[" + w + "] ");
        }
        System.out.println();
    }
}