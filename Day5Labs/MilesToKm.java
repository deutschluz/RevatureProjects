import java.util.Scanner;

public class MilesToKm{
		public static void main(String[] args){		
			miToKm(receiveInput(inp));	
		}
		public static double receiveInput(){
			Scanner inp= new Scanner(System.in);
			System.out.println("Enter miles: ");
			double UserIn= inp.nextDouble();
			inp.close();
			return UserIn;
		}
		public static void miToKm(double MI){
			double result = MI*1.609;
			System.out.println(MI + " miles is "+result +" km.");
		}
}