public class Main {
    public static void main(String[] args) {


        Account myPenguin = new Penguin();

        myPenguin.deposit(1000.00);

        System.out.println(myPenguin.saldo);

        myPenguin.withdraw(504);

        System.out.println(myPenguin.saldo);


        Account myCredit = new Credit();

        myCredit.deposit(1000.00);

        System.out.println(myCredit.saldo);

        myCredit.withdraw(9000);

        System.out.println(myCredit.saldo);

    }
}