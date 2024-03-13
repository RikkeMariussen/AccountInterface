public class Penguin extends Account {
    //Withdraw money if there are sufficent funds. - debitkonto
    protected int maxWithdraw = 500;

    public void withdraw(double amount) {
        if (this.saldo < amount || amount > this.maxWithdraw) {
            System.out.println("You cannot withdraw this much");
        } else {
            this.saldo -= amount;
            System.out.println("Withdrawal approved, new saldo: " + this.saldo);
        }
    }
}
