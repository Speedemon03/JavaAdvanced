import java.util.*;

public class App {
    // instantiate Scanner property
    final private static Scanner ScannerObj = new Scanner(System.in);

    public static void main(String[] args) throws Exception {      
        // get user input  
        System.out.println("Enter a degree in Celsius: ");
        double celsius = ScannerObj.nextDouble();

        // instantiate the TemperatureConversion objects
        TemperatureConversion dConverter = new TemperatureConversion();
        TemperatureConversion pConverter = new TemperatureConversion(celsius);
        
        // set celsius 
        dConverter.SetCelsius(celsius + 100);

        // convert celsius to fahrenheit
        double dOutput = dConverter.CelsiusToFahrenheit();
        double pOutput = pConverter.CelsiusToFahrenheit();

        // print the things
        System.out.println("dConverter - " + dConverter.GetCelsius() + " Celsius converts to " +  dOutput +  " Fahrenheit");    
        System.out.println("pConverter - " + pConverter.GetCelsius() + " Celsius converts to " +  pOutput +  " Fahrenheit");    
                
        //System.out.println(celsius + "Celsius is " + fahrenheit + "Fahrenheit");                    
    }
}
 