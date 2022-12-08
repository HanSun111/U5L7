
public class RaceUtility {
    private double miles;
    private double kilometer;

public static double milesToKm(double num){
return num * 1.60934;
}
    public static double kmToMiles(double num){
return num / 1.60934;
    }

    public static String makeProper(String s) {
        String words[]=s.split("\\s");
        String capitalizeWord="";
        for(String w:words){
            String firstLetter = w.substring(0,1);
            String others = w.substring(1);
            others = others.toLowerCase();
            capitalizeWord += firstLetter.toUpperCase() + others + " ";

        }
        return capitalizeWord;
    }
}
