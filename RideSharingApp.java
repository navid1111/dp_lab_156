import java.util.Scanner;

public class RideSharingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create instances of Rider and Driver
        Rider rider = new Rider("1234", "John Doe", "Dhaka");
        Driver driver = new Driver("123", "Mask", "SUV", 23.33, 90);

        // Ask the user to select a ride type
        System.out.println("Select Ride Type:");
        System.out.println("1. Economy Ride");
        System.out.println("2. Premium Ride");
        int rideTypeChoice = scanner.nextInt();
        IRideType rideType = null;

        // Set the ride type based on user input
        switch (rideTypeChoice) {
            case 1:
                rideType = new CarPool();
                break;
            case 2:
                rideType = new Bike();
                break;
            default:
                System.out.println("Invalid ride type selected.");
                return;
        }

        // Ask the user to select a payment method
        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        int paymentMethodChoice = scanner.nextInt();
        PaymentMethode paymentMethod = null;

        // Set the payment method based on user input
        switch (paymentMethodChoice) {
            case 1:
                System.out.print("Enter Credit Card Number: ");
                String cardNumber = scanner.next();
                paymentMethod = new CreditCardPayment(cardNumber);
                break;
            case 2:
                System.out.print("Enter PayPal Email: ");
                String email = scanner.next();
                paymentMethod = new OnlinePayment(email);
                break;
            default:
                System.out.println("Invalid payment method selected.");
                return;
        }

        // Set the distance for the trip
        double distance = 12.5; // in kilometers

        // Create the booking
        Booking booking = new Booking(rider, driver, rideType, paymentMethod, distance);

        // Make the booking and process the ride
        booking.makeBooking(driver,rider,rideType,paymentMethod,distance);

        // Close the scanner
        scanner.close();
    }
}
