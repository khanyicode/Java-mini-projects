public class BankAccount {
    private String accountHolder;
    private double balance;
    private double accountNumber;

    public BankAccount(String accountHolder, double balance, double accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public double getAccountNumber(){
        return accountNumber;
    }

    public void setAccountHolder( String accountHolder){
        this.accountHolder=accountHolder;
    }

    public void setAccountNumber(double accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
      BankAccount bankAccount = new BankAccount("khanyisile",9000,12345678);
      BankAccount bankAccount1 = new BankAccount("Nicole",6000,23451678);
    }

}

