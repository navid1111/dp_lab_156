public class CreditCardPayment implements PaymentMethode {
    String cardNumber;
    public CreditCardPayment(String cardNumber){
        this.cardNumber=cardNumber;
    }
    @Override
    public void pay(double amount) {

    }
}
