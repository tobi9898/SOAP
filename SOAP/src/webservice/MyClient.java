package webservice;

import webservice.gen.mywebserviceservice.AlexWebServices;
import webservice.gen.mywebserviceservice.MyWebServiceService;

import java.util.Scanner;

public class MyClient {

	public static void main(String[] args)
	{
		System.out.println("Operation eingeben:");
		Scanner scanner = new Scanner(System.in);
		String operation = scanner.nextLine();

		AlexWebServices service = new MyWebServiceService().getAlexWebServicesPort();

		System.out.println("Erste Zahl:");
		String zahl1 = scanner.nextLine();
		
		System.out.println("Zweite Zahl:");
		String zahl2 = scanner.nextLine();

		System.out.println("Ergebnis ist: " + service.rechne(operation, Integer.parseInt(zahl1), Integer.parseInt(zahl2)));
		scanner.close();
	}
}
