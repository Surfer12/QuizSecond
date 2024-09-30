
/* 
Based on the provided Java code, draw a flowchart that visually represents the algorithm's logic. Clearly depict the loops, conditional statements, and the flow of control throughout the program. 

Note: The code intentionally uses non-descriptive variable names and lacks explanatory output because there is a follow up question to test your ability to interpret its functionality. */

public class MyClass {
    public static void main(String[] args) {
        String a = "Hello, world!";
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            boolean d = false;

            for (int j = 0; j < i; j++) {
                if (a.charAt(j) == c) {
                    d = true;
                    break; 
                }
            }

            if (d && b.indexOf(String.valueOf(c)) == -1) {
                b.append(c).append(" ");
            }
        }

        if (b.length() == 0) {
            System.out.println("Say something 1....");
        } else {
            System.out.println("characters found: " + b);
        }
    }
}