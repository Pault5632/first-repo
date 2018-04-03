import java.util.Scanner;

public class ConvertIndex{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println();
    System.out.println("1. Fahrenheit");
    System.out.println("2. Celsius to Fahrenheit");
    System.out.println("3. Exit");
    System.out.println();

    System.out.print("Choice: ");
    int choice = input.nextInt();
    System.out.println();

     switch(choice){
         case 1:
           System.out.println("Fahrenheit to celsius");
           Convert.main(null); //static method call, no instance required.
           break;

         case 2:
           System.out.println("Celsius to Fahrenheit");
           System.out.println();
           Convert.main(null);
           break;

         case 3:
           System.out.println("Exiting....");
	 	   break;
	 	  default:
		  System.out.println("Invalid choice");
	}
	System.out.println();
  }
}
