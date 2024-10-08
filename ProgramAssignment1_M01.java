// Convert Feet into Meters
//public static double foottoMeter (double foot) {
// Convert Meters into Feet
//public static double meterToFoot (double meter) {
// Write a test program that invokes these methods to display the following tables:
//     Feet     Meters     |    Meters    Feet
//     -------------------------------------------
//     1.0      0.305      |    20.0      65.574
//     2.0      0.610      |    25.0      81.967
//     ...       
//     9.0      2.745      |    60.0      196.721
//     10.0     3.050      |    65.0      213.115

public class ProgramAssignment1_M01 {
    /** Main method*/
    public static void main(String[] args) {
        //table
        System.out.println ("Feet    Meters  |   Meters   Feet");
        System.out.println ("____________________________________");
        for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters +=5) {
            System.out.printf("%4.1f   ", feet);
            System.out.printf("%6.3f", footToMeter(feet));
            System.out.print("  |   ");
            System.out.printf("%-11.1f", meters);
            System.out.printf("%7.3f\n", meterToFoot(meters));
        }
        
    }

    /*feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}
