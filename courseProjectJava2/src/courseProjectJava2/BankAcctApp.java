package courseProjectJava2;

import java.util.ArrayList;
import java.util.List;

public class BankAcctApp {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        boolean continueInput = true;

        System.out.println("Welcome to the Banking Application!");

        while (continueInput) {
            Customer customer = new Customer();

            // Input customer data
            customer.setCustomerId(DataEntry.getCustomerId());
            customer.setSsn(DataEntry.getSsn());
            customer.setLastName(DataEntry.getLastName());
            customer.setFirstName(DataEntry.getFirstName());
            customer.setStreet(DataEntry.getStreet());
            customer.setCity(DataEntry.getCity());
            customer.setState(DataEntry.getState());
            customer.setZip(DataEntry.getZip());
            customer.setPhone(DataEntry.getPhone());

            customers.add(customer);

            String continueChoice = DataEntry.getLimitedString("Do you want to enter another customer? (Y/N): ", 1);
            continueInput = continueChoice.equalsIgnoreCase("Y");
        }

        // Display all customers
        System.out.println("\nCustomer Information:");
        System.out.println("=====================");
        for (Customer customer : customers) {
            System.out.println(customer);
            System.out.println("=====================");
        }
    }
}