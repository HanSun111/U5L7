public class Runner
{
    public static void main(String[] args)
    {

        Runner.convert(13.85, 26.42, 5, 0, 40, 3.5, 20.5, 0);

        String title = "welcome to the marathon!";
        Runner.dialogue(title);

        title = "It's TIME for THE 5k!";
        Runner.dialogue(title);

        title = "runners, take your marks...";
        Runner.dialogue(title);

        title = "2 MILES TO GO!";
        Runner.dialogue(title);

        title = "water break in 0.5 miles";
        Runner.dialogue(title);
    }
    public static void convert(double miles1, double miles2, double miles3, double miles4, double km1, double km2, double km3, double km4){
        System.out.println(RaceUtility.milesToKm(miles1));
        System.out.println(RaceUtility.kmToMiles(km1));
        System.out.println(RaceUtility.milesToKm(miles2));
        System.out.println(RaceUtility.kmToMiles(km2));
        System.out.println(RaceUtility.milesToKm(miles3));
        System.out.println(RaceUtility.kmToMiles(km3));
        System.out.println(RaceUtility.milesToKm(miles4));
        System.out.println(RaceUtility.kmToMiles(km4));
    }

    public static void dialogue(String title){
        System.out.println(RaceUtility.makeProper(title));
    }

}
