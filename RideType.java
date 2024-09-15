
public enum RideType {
    CARPOOL(5), LUXURY(20), BIKE(2);

    private double ratePerKm;

    RideType(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public void setRatePerKm(double ratePerKm){
        this.ratePerKm=ratePerKm;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }
}

