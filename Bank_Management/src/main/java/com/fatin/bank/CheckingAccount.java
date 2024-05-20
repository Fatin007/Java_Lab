package com.fatin.bank;

/**
 *
 * @author MOHAMMAD FATIN NUR
 */
public class CheckingAccount extends BankAccount{
    double transectionLimit;

    public CheckingAccount(String accNo, double balance, double transectionLimit) {
        super(accNo, balance);
        this.transectionLimit = transectionLimit;
    }

    public double getTransectionLimit() {
        return transectionLimit;
    }

    public void setTransectionLimit(double transectionLimit) {
        this.transectionLimit = transectionLimit;
    }

    public void deductTransectionFee(double amount) {
        double fee = amount * 0.02;
        if (fee > transectionLimit){
            setBalance(getBalance() - fee);
            System.out.println("Transection fee: " + fee + " Taka");
        }
    }

    public String toString() {
        return super.toString() + "\nTransection Limit: " + transectionLimit + "\n";
    }
}
