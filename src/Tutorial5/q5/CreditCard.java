package Tutorial5.q5;
//you can inherit from interfaces to interface from the extends keyword without using the implement keyword
//psvm for main method
public class CreditCard extends Card{
    private int pinNumber;
    private int number;

    public CreditCard(String n, int pinNumber,int number){
        super(n);
        this.pinNumber = pinNumber;
        this.number = number;
    }
    @Override
    public boolean isExpired() {
        return false;
    }
}
