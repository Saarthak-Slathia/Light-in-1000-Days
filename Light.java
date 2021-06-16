public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // Approximate speed of light in miles
        lightspeed = 186286;
        days = 1000; // Number of days specification.
        seconds = days * 24 * 60 * 60; // Conversion to seconds.
        distance = lightspeed * seconds; // Calculating Distance...


        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles !");
    }
}
