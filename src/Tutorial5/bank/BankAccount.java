package Tutorial5.bank;

public class BankAccount implements Comparable<BankAccount>{
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    @Override
    public int compareTo(BankAccount o) {
        if(balance>o.getBalance()){
            return 1;
        }
        return 0;
    }
}
