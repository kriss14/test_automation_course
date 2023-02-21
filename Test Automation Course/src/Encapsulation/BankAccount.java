package Encapsulation;

public class BankAccount {
    private String noAccount = "123456789";
    private Float sold = 2700.50f;

    public String getNoAccount() {
        return noAccount;
    }

    public Float getSold() {
        return sold;
    }

    public void setNoAccount( String noAccountToSet) {
        noAccount = noAccountToSet;
    }

    public void setSold(Float soldToSet) {
        sold = soldToSet;
    }
}
