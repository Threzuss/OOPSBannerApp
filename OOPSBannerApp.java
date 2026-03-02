/**
 * OOPSBannerApp UC6 OOPS Banner Application (Use Case 6)
 *
 * This use case extends UC5 by implementing a modular approach to generate each
 * letter's pattern through dedicated methods. This enhances code reusability and
 * maintainability by separating pattern generation logic from the main display logic.
 *
 * @version 6.0
 */
public class OOPSBannerApp {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "  **** ",
            " ** ** ",
            " ** ** ",
            " ** ** ",
            " ** ** ",
            " ** ** ",
            "  **** "
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            " ****** ",
            " ** ** ",
            " ** ** ",
            " ****** ",
            " ** ",
            " ** ",
            " ** "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            "  **** ",
            " ** ** ",
            " ** ",
            "  **** ",
            "     ** ",
            " ** ** ",
            "  **** "
        };
    }

    public static void main(String[] args) {
        
        // Declare String Arrays to hold patterns for each letter by calling the helper methods
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Use a standard for-loop to assemble and print each line of the banner[cite: 70].
        // We use the length of the arrays (7) to loop through each row.
        for (int i = 0; i < oPattern.length; i++) {
            // Concatenate the rows for O, O, P, and S side-by-side with a space in between
            System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
        }
    }
}