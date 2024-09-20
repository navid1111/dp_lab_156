public class OnlinePayment implements PaymentMethode{
    String email;
    public  OnlinePayment(String email){
        this.email=email;
    }
    @Override
    public void pay(double amount) {

    }
}
