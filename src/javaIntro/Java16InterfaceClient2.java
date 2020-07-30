package javaIntro;

public class Java16InterfaceClient2 implements Java14InterfaceBank {
    @Override
    public void PayCreditCard() {
        System.out.println("Payment is due on the 18th of each month");
    }

    @Override
    public void GenerateStatement() {
        System.out.println("Statement will generate on the 20th of each month ");

    }

    @Override
    public void TransferBalance() {
        System.out.println("Balance transfer have 1% or $10 fee.");
    }

    @Override
    public void CheckBalance() {
        System.out.println("You can check your balance 24hr");
    }

    public static void main(String[] args) {
        Java16InterfaceClient2 ic2 = new Java16InterfaceClient2();
        ic2.CheckBalance();
        ic2.GenerateStatement();
        ic2.PayCreditCard();
        ic2.TransferBalance();

    }
}
