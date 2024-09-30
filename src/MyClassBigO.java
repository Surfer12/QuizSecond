/* 

Analyze the above code and determine its time complexity using Big O notation. Explain your reasoning and identify the factors that contribute to the time complexity. */


public class MyClassBigO {
    public static void main(String[] args) {
        String a = "Hello, world!"; // O(1)
        StringBuilder b = new StringBuilder(); // O(1)

        for (int i = 0; i < a.length(); i++) { // O(n)
            char c = a.charAt(i); // O(1)
            boolean d = false; // O(1)

            for (int j = 0; j < i; j++) { // O(n)
                if (a.charAt(j) == c) {
                    d = true;
                    break; 
                }
            } // O(n^2)

            if (d && b.indexOf(String.valueOf(c)) == -1) { // O(1)
                b.append(c).append(" "); // O(1)
            }
        } // O(n^2)

        if (b.length() == 0) { // O(1)
            System.out.println("Say something 1...."); // O(1)
        } else { // O(1)
            System.out.println("characters found: " + b); // O(1)
        }
    }
}

// O(n^2) is the total time complexity of the code. 
// The code has two nested loops, each iterating over the length of the string and checking associated conditions. 
// The outer loop runs n times, where n is the length of the string. For each iteration of the outer loop, the inner loop runs n times, where n is the current index of the outer loop. 
// The StringBuilder operations (append and indexOf) are considered constant time operations, O(1), as they are performed in a single step. 
// The if-else statement is a constant time operation, O(1), as it is executed in a single step. 
// The println statement is a constant time operation, O(1), as it is executed in a single step. 
// Therefore, the overall time complexity of the code is O(n^2), as the nested loops dominate the time complexity and the other constant time operations are negligible in comparison.