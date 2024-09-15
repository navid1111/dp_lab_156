public class Rider {
//    Attributes: id, name, location, rating, preferredPaymentMethod,
    private String id;
    private  String name;
    private String location;
    private  double latitude;
    private  double longitude;
    private  double rating;
    private PaymentMethode preferredPaymentMethode;


    public Rider(String id, String name, String location, PaymentMethode paymentMethod) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.preferredPaymentMethode = paymentMethod;

    }
    public void setRating(double rating){
        this.rating=(this.rating+rating)/2;
    }
//– Behaviors: requestRide(), rateDriver(), makePayment().
//            – Relations: Can book a Trip, interacts with PaymentMethod and Driver.
    public  void requestRide(double latitude,double longitude, RideType rideType,PaymentMethode preferredPaymentMethode)
    {

    }
    public void rateDriver(Driver driver,double rating){
        driver.setRating(rating);


    }
    public void makePayment(PaymentMethode paymentMethode,double amount){

    }

}
