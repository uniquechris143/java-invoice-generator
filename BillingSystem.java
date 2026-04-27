package project;
import java.util.Scanner;

public class BillingSystem {
  public static void main(String[] args) {
      

    Scanner scanner = new Scanner(System.in);

    String client;
    String project;
    int hours;
    double rate;
    boolean status = true;

    System.out.println("--- INPUT SECTION ---");

    System.out.print("Enter Client Name: ");
    client = scanner.nextLine();

    System.out.print("Enter Project Name: ");
    project = scanner.nextLine();

    System.out.print("Enter Total Hours Worked: ");
    hours = scanner.nextInt();

    System.out.print("Enter Hourly Rate ($): ");
    rate = scanner.nextDouble();

    System.out.println();

    System.out.println("--- OFFICIAL INVOICE: " + project + " ---");
    System.out.println("Client: " + client);
    System.out.println("Rate: " + rate + "/hr");
    System.out.println("Time: " + hours + " hours");

    System.out.println();

    double totalAmount = hours * rate;

    System.out.println("---------------------------------------");
    System.out.println("TOTAL AMOUNT DUE: $" + totalAmount);
    System.out.println("---------------------------------------");
    System.out.println("Status: Payment Pending " +  "(" + status + ")");

    scanner.close();
  }
}
