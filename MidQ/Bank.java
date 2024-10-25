package MidQ;
class BankAccount{
    private double balance;

    BankAccount(double balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }

    public double withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient balance.");
            return balance;
        }
        balance -= amount;
        return balance; 
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }
}

public class Bank{
    public static void main(String[] args) {
        BankAccount obj = new BankAccount(5000);

        double tk = obj.withdraw(2000);
        System.out.println("Balance after withdrawal: " + tk);

        double tk1 = obj.deposit(3000);
        System.out.println("Balance after deposit: " + tk1);
    }
}
