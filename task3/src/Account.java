public class Account {
    private double balance;
    private int accNumber;

    public Account(int accNumber) {
        this.balance = 0.0;
        this.accNumber = accNumber;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            balance += sum;
        }
    }

    public void withdraw(double sum) {
        if (sum > 0 && sum <= balance) {
            balance -= sum;
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void transfer(double amount, Account other) {
        if(amount > 0 && amount <= balance) {
            this.withdraw(amount);
            other.deposit(amount);
        }
    }

    public String toString() {
        return "account number: " + getAccNumber() +
                ", balance: " + getBalance();
    }

    public final void print() {
        System.out.println(toString());
    }
}
