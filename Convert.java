import java.util.Scanner;
public class Convert {
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   double celsius;
   double fahrenheit;

   System.out.print("Enter Temperature: ");
   fahrenheit = input.nextDouble();

   celsius = 5.0/9.0 * (fahrenheit -32);

   System.out.println();
   System.out.printf(fahrenheit+" Fahrenheit is "+celsius+" Celsius");
   System.out.println();
    ConvertIndex.main(null);
   }
 }

