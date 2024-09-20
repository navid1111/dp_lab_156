// Booking Class
public class Booking {
    private Rider rider;
    private Driver driver;
    private IRideType rideType;
    private PaymentMethode paymentMethode;
    private double distance;

    // Constructor
    public Booking(Rider rider, Driver driver, IRideType rideType, PaymentMethode paymentMethode,double distance) {
        this.rider = rider;
        this.driver = driver;
        this.rideType = rideType;
        this.paymentMethode = paymentMethode;
        this.distance=distance;
    }
    public void makeBooking(Driver driver ,Rider rider,IRideType rideType,PaymentMethode paymentMethode,double distance){
        rider.pay(this.paymentMethode,this.rideType,this.distance);




    }





}
