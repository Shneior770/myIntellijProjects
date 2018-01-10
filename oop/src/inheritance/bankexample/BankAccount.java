package inheritance.bankexample;

public class BankAccount {

    private double balance = 0.0;
    private int id = 0;
    private String name;

    private BankAccount(Client client) {
        this.id = client.getId();
        this.name = client.getName();

    }
    public static BankAccount accountInstance(Client client){
        return new BankAccount(client);
    }

    public void withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public void transfer(double amount, BankAccount ba) {
        if (balance >= amount) {
            balance -= amount;
            ba.deposit(amount);
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof BankAccount))
            return false;
        BankAccount ba = (BankAccount) object;
        return (ba.getName().equals(this.name));
    }

    private String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }



}
