public class Main
{
    //----------------------------------------------------------
    // Stores the possible grades and their numeric lowest value,
    // then prints them out.
    //----------------------------------------------------------

    public static void main (String[] args)
    {
        System.out.println ("Alexa Torres, Classword 6.1A");
        System.out.println ();

        String[] grades = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F"};
        int[] cutoff = {05, 90, 87, 83, 80, 77, 73, 70, 67, 63, 60, 0};

        for (int level = 0; level < cutoff.length; level++)
        {
            System.out.println (grades[level] + "\t" + cutoff[level]);
        }//End for loop
    }//End main method
}//End class Main
