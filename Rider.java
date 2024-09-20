public class Rider {
//    Attributes: id, name, location, rating, preferredPaymentMethod,
    private String id;
    private  String name;
    private String location;
    private  double latitude;
    private  double longitude;
    private  double rating;



    public Rider(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;


    }
    public void setRating(double rating){
        this.rating=(this.rating+rating)/2;
    }
//– Behaviors: requestRide(), rateDriver(), makePayment().
//            – Relations: Can book a Trip, interacts with PaymentMethod and Driver.
    public  void requestRide(double latitude,double longitude, IRideType rideType,PaymentMethode preferredPaymentMethode)
    {
        System.out.println("Rider"+this.name+" is requesting for a ride");


    }
    public void rateDriver(Driver driver,double rating){
        driver.setRating(rating);


    }
    public void pay(PaymentMethode paymentMethode,IRideType rideType, double distance){
        double amount=rideType.ratePerKn()*distance;
        System.out.println("Payed TK"+amount);

    }




}
