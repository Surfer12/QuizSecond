public class MyClassReWorded {
    public static void main(String[] args) {
        String inputString = "Hello, world!"; 
        StringBuilder uniqueCharacters = new StringBuilder(); 

        for (int currentIndex = 0; currentIndex < inputString.length(); currentIndex++) { // O(n)
            char currentChar = inputString.charAt(currentIndex);
            boolean isDuplicate = false;

            for (int previousIndex = 0; previousIndex < currentIndex; previousIndex++) { // O(n)
                if (inputString.charAt(previousIndex) == currentChar) {
                    isDuplicate = true;
                    break; 
                }
            }

            if (isDuplicate && uniqueCharacters.indexOf(String.valueOf(currentChar)) == -1) {
                uniqueCharacters.append(currentChar).append(" ");
            }
        }

        if (uniqueCharacters.length() == 0) {
            System.out.println("Say something 1....");
        } else {
            System.out.println("characters found: " + uniqueCharacters);
        }
    }
}