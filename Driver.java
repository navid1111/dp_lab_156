public class Driver {
//    Attributes: id, name, vehicleType, location, rating, availability.
    private  String id;
    private  String name;
    private  RideType rideType;

    private  String location;
    private double currentLatitude;
    private  double currentLongitude;
    private  double rating;
    private  boolean availability;
    private  String vehicleType;


    public void setRating(double rating){
        this.rating=(this.rating+rating)/2;
    }

    public Driver(String id, String name, String vehicleType, String location) {
        this.id = id;
        this.name = name;
        this.vehicleType = vehicleType;
        this.location = location;
        this.availability = true; // Initially, drivers are available
    }
//    – Behaviors: acceptRide(), rateRider(), updateLocation(), startTrip().
//            – Relations: Accepts a Trip and interacts with the Rider.

    public void acceptRide(Trip trip){
        if(this.availability==false)
        {
            System.out.println("You are currently serving another trip");
        }
        this.availability=false;

    }
    public void updateLocation(double latitude,double longitude){
        this.currentLatitude=latitude;
        this.currentLongitude=longitude;
    }
    public  void rateRider(Rider rider,double rating){
        rider.setRating(rating);

    }

}
