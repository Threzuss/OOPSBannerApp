/**
 * OOPSBannerApp UC5 Render OOPS as Banner using Inline Array Initialization
 *
 * This use case extends UC4 by defining and populating the String array in a more
 * concise way at the time of declaration using String.join() method to create each
 * line of the banner. [cite: 36]
 * * @version 5.0 [cite: 36]
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        
        // Define and populate a String array with each line of the banner using String.join() 
        // Combining array declaration, initialization, and population in a single statement.
        String[] lines = {
            String.join("", "  **** ", "  **** ", "  ****** ", "  **** "),
            String.join("", " ** ** ", " **  ** ", " **  ** ", " ** ** "),
            String.join("", " ** ** ", " **  ** ", " **  ** ", " ** "),
            String.join("", " ** ** ", " **  ** ", " ****** ", "  **** "),
            String.join("", " ** ** ", " **  ** ", " ** ", "        ** "),
            String.join("", " ** ** ", " **  ** ", " ** ", "     ** ** "),
            String.join("", "  **** ", "  **** ", "  ** ", "     **** ")
        };

        // Use a for-each loop to iterate through the array and print each line 
        for (String line : lines) {
            System.out.println(line);
        }
    }
}