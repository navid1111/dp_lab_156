public class Admin {
    private RideType rideType;
    public  void setRideType(RideType rideType,double amount){
        rideType.LUXURY.getRatePerKm(amount);
    }
}
