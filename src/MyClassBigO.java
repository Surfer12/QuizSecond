/* 

Analyze the above code and determine its time complexity using Big O notation. Explain your reasoning and identify the factors that contribute to the time complexity. */


public class MyClassBigO {
    public static void main(String[] args) {
        String a = "Hello, world!"; // O(1)
        StringBuilder b = new StringBuilder(); // O(1)

        for (int i = 0; i < a.length(); i++) { // O(n)
            char c = a.charAt(i); // O(1)
            boolean d = false; // O(1)

            for (int j = 0; j < i; j++) { // O(i)
                if (a.charAt(j) == c) {
                    d = true;
                    break; 
                }
            } 

            if (d && b.indexOf(String.valueOf(c)) == -1) { // O(1)
                b.append(c).append(" "); // O(1)
            }
        } 

        if (b.length() == 0) { // O(1)
            System.out.println("Say something 1...."); // O(1)
        } else { // O(1)
            System.out.println("characters found: " + b); // O(1)
        }
    }
}

// O(n^2) is the total time complexity of the code. 
// The code has a nested for loop within a for loop. 
// The first for loop iterates over the length of the input string and assigns the character at the current index 'i' to the character type variable 'c', as well as initializes a boolean type variable 'd' to false. 
// The initalization of the boolean type variable 'd' is constant time, O(1) as well as the assignment of the character type variable 'c' to the character at the current index 'i' of the first for loop. 
// The outer loop runs n times, where n is the length of the input string 'a'.
// For each iteration of the inner loop, the inner loop runs i times, where i is the current index of the outer loop that is incrementing until it reaches the length of the input string 'a'. 
// The StringBuilder operations (append and valueOf) are considered constant time operations, O(1) as well as the if and else statements, O(1). The println statement is a constant time operation, O(1).
// With those factors in consideration, the overall time complexity of the code is O(n^2), as the nested loops are the deciding factor in the time complexity and the other constant time operations are negligible in comparison and therefore are not considered in the overall time complexity because of the lack of significance.