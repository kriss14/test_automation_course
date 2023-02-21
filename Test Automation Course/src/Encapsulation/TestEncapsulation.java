package Encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        BankAccount test = new BankAccount();
        System.out.println("Your account no is " + test.getNoAccount());
        test.setNoAccount("IBAN200350799230");
        String accountNo = test.getNoAccount();
        System.out.println("Your new account no is " + accountNo);
        System.out.println("Your sold for the " + accountNo + " is " + test.getSold());
        test.setSold(250900f);
        Float newSold = test.getSold();
        System.out.println("Your new sold for the " + accountNo + " is " + newSold);
    }
}
