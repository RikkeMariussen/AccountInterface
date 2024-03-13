public class Credit extends Account{

protected int maxWithdraw = 10000;
protected int maxCredit = 5000;
    public void withdraw(double amount) {
        if(this.saldo <= -maxCredit || amount > this.maxWithdraw){
            System.out.println("Withdrawal failed due to insufficent funds");
        }else{
            this.saldo -= amount;
            System.out.println("Withdrawal approved, new saldo: "+ this.saldo);
        }
    }

    //Can withdraw no matter what funds, but max 5.000 at a time
}
