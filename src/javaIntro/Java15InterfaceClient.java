package javaIntro;

public class Java15InterfaceClient implements Java14InterfaceBank , Java18InterfaceBankOffers {

    @Override
    public void CheckBalance() {
       System.out.println("You can not check you balance after midnight");
    }

    @Override
    public void GenerateStatement() {
        System.out.println("Statement will generate by the 1st of each month");
    }

    @Override
    public void PayCreditCard() {
        System.out.println("Payment is due on the 30th of each month");
    }

    @Override
    public void TransferBalance() {
        System.out.println("Balance transfer is free");
    }

    @Override
    public void CashBack() {
        System.out.println("We provide 5% cash back");
    }

    @Override
    public void AnnualFee() {
        System.out.println("Have $200 Annual fee");
    }

    @Override
    public void APRInterest() {
        System.out.println("No APR for 18 months then 23% after the 18 month");
    }
    public static void main(String[] args) {
        Java15InterfaceClient ic = new Java15InterfaceClient();
        ic.CheckBalance();
        ic.GenerateStatement();
        ic.PayCreditCard();
        ic.TransferBalance();
        ic.AnnualFee();
        ic.APRInterest();
        ic.CashBack();
    }
}
