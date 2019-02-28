public class FarenheitConverter {

    static double convertToCelsius(int xfarenheit){
        double resultCelsius = 5/9.0 * (xfarenheit - 32);
        return resultCelsius;}

    static double convertToFarenheit (int celsjusz){
        double resultFarenheit = celsjusz * 9/5.0 + 32;
        return resultFarenheit;
    }
    public static void main(String[] args) {

        int xfarenheit = 100;
        System.out.println( "stopnie celsjusza = " + convertToCelsius(xfarenheit));
        int celsjusz = 100;
        System.out.println("stopnie Farenheita = " + convertToFarenheit(celsjusz));

    }

}
