// Booking Class
public class Booking {
    private Rider rider;
    private Driver driver;
    private IRideType rideType;
    private PaymentMethode paymentMethode;
    private double distance;

    // Constructor
    public Booking(Rider rider, Driver driver,double distance) {
        this.rider = rider;
        this.driver = driver;

        this.distance=distance;
    }

    public void setPaymentMethode(PaymentMethode paymentMethode) {
        this.paymentMethode = paymentMethode;
    }
    public void setRideType(IRideType rideType){
        this.rideType=rideType;
    }

    public void makeBooking(){
        paymentMethode.pay(rideType.ratePerKn()*distance);






    }





}
