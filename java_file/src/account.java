public class ac {
    private int ac_no;
    private String ac_name;
    private double balance;

    public Accounts(int ac_no, String ac_name, double balance) {
        this.ac_no = ac_no;
        this.ac_name = ac_name;
        this.balance = balance;
    }

    public void withdrawal(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Current balance: " + balance);
    }

    public void display() {
        System.out.println("Account details:");
        System.out.println("Account number: " + ac_no);
        System.out.println("Account name: " + ac_name);
        System.out.println("Balance: " + balance);
    }
}
