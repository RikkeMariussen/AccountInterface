abstract public class Account {

    //Attributer
    protected double saldo;
    protected int maxWithdraw;


    abstract public void withdraw(double amount);

    public void deposit(double amount) {
        this.saldo += amount;
    }


}
