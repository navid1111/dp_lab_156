import java.util.Scanner;

public class RideSharingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Rider rider = new Rider("1234", "John Doe", "Dhaka");
        Driver driver = new Driver("123", "Mask", "SUV", 23.33, 90);

        // Ask the user to select a ride type
        System.out.println("Select Ride Type:");
        System.out.println("1. Carpool");
        System.out.println("2. Bike");
        int rideTypeChoice = scanner.nextInt();
        IRideType rideType = null;
        Booking book =new Booking(rider,driver,400);


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
                System.out.println("Invalid payment method selected. ");
                return;
        }

        // Set the distance for the trip


        // Create the booking
        book.setRideType(rideType);
        book.setPaymentMethode(paymentMethod);
        System.out.println("Do you want to confirm your ride Your total bill was "+rideType.ratePerKn()*400);
        System.out.println("1 YES");
        System.out.println("2 NO");
        int confirmation = scanner.nextInt();



        switch (confirmation){
            case 1:
                book.makeBooking();
                System.out.println("Booking successful");
                break;
            case 2:
                return;




        }

        // Make the booking and process the ride


        // Close the scanner
        scanner.close();
    }
}
