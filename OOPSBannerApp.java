/**
 * OOPSBannerApp UC3 - Screenshot Match
 * Displays "OOPS" horizontally using String.join().
 * Matches the visual output from the user screenshot (5 lines high).
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        
        // Define the gap between letters (5 spaces)
        String gap = "     "; 

        // --- Line 1 (Top) ---
        // O(5) + gap + O(5) + gap + P(8) + gap + S(8)
        System.out.println(String.join("", 
            "*****", gap, 
            "*****", gap, 
            "********", gap, 
            " ********"
        ));

        // --- Line 2 (Upper Middle) ---
        // O(5) + gap + O(5) + gap + P(8) + gap + S(Left)
        System.out.println(String.join("", 
            "** **", gap, 
            "** **", gap, 
            "**    **", gap, 
            " **" 
        ));

        // --- Line 3 (Middle Bar) ---
        // O(5) + gap + O(5) + gap + P(8) + gap + S(8)
        System.out.println(String.join("", 
            "** **", gap, 
            "** **", gap, 
            "********", gap, 
            " ********"
        ));

        // --- Line 4 (Lower Middle) ---
        // O(5) + gap + O(5) + gap + P(Left) + gap + S(Right)
        System.out.println(String.join("", 
            "** **", gap, 
            "** **", gap, 
            "** ", gap, // P needs padding to push the gap
            "            **"      // S is right-aligned
        ));

        // --- Line 5 (Bottom) ---
        // O(5) + gap + O(5) + gap + P(Left) + gap + S(8)
        System.out.println(String.join("", 
            "*****", gap, 
            "*****", gap, 
            "** ", gap, // P needs padding
            "      ********"
        ));
    }
}