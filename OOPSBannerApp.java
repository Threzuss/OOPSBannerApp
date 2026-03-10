import java.util.HashMap;

/**
 * OOPSBannerApp
 * Use Map for Character Patterns and Render via Function
 *
 * This use case extends UC7 by utilizing advanced Object-Oriented Programming concepts
 * such as the Collections Framework to manage character patterns in a more flexible
 * and efficient manner.
 * * @version 8.0
 */
public class OOPSBannerApp {

    /**
     * Creates a HashMap containing ASCII art patterns for supported characters.
     * @return a HashMap where keys are characters and values are String arrays
     */
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        // Populate charMap with patterns for 'O', 'P', 'S', and ' '
        charMap.put('O', new String[]{
            "   *** ",
            " ** ** ",
            " ** ** ",
            " ** ** ",
            " ** ** ",
            " ** ** ",
            "   *** "
        });

        charMap.put('P', new String[]{
            " ****** ",
            " ** ** ",
            " ** ** ",
            " ****** ",
            " ** ",
            " ** ",
            " ** "
        });

        charMap.put('S', new String[]{
            "  ***** ",
            " ** ** ",
            " ** ",
            "  **** ",
            "      ** ",
            " ** ** ",
            "  ***** "
        });

        charMap.put(' ', new String[]{
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       "
        });

        return charMap;
    }

    /**
     * Displays a banner message using the provided character map.
     * @param message the String message to display
     * @param charMap a HashMap containing character patterns
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        // Assuming all patterns have the same height
        int patternHeight = 7; 

        // Loop through each line of the pattern height and build the banner line
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            
            for (char ch : message.toCharArray()) {
                // Retrieve the pattern from the HashMap, default to space if not found
                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                
                // Adding space between characters
                sb.append(pattern[line]).append(" "); 
            }
            
            System.out.println(sb.toString());
        }
    }

    /**
     * Main entry point of the application.
     */
    public static void main(String[] args) {
        // Initialize the HashMap with character patterns
        HashMap<Character, String[]> charMap = createCharacterMap();
        
        String message = "OOPS";
        
        // Render the banner
        displayBanner(message, charMap);
    }
}