public class SavingsAccount{
    int balance;
    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    //余额方法
    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }

    //取款方法
    public int withdraw(int amountBalance){
        balance -= amountBalance;
        System.out.println("You just withdrwa " + amountBalance);
        return balance;
    }

    //存款方法
    public int deposit(int amountBalance){
        balance += amountBalance;
        System.out.println("You just deposit " + amountBalance);
        return balance;
    }
    //toString()方法
    public String toString(){
        return "Hello! This is a savings account with " + balance + " saved.";
    }

    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);
        System.out.println(savings);
        savings.checkBalance();
        savings.withdraw(600);
        savings.checkBalance();
        savings.deposit(500);
        savings.checkBalance();
    }
}