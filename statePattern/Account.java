public class Account{
    private String accountNumber;
    private Double balance;
    private AccountState accountState;

    public Account(String accountNumber, Double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountState = new ActiveState();
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public AccountState getAccountState() {
        return accountState;
    }
    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public void suspend(){
        accountState.suspend(this);
    }

    public void activate(){
        accountState.activate(this);
    }

    public void close(){
        accountState.close(this);
    }

    public void deposit(Double depositAmount){
        accountState.deposit(this,depositAmount);
        System.out.println(toString());
    }
    
    public void withdraw(Double withdrawAmount){
        accountState.withdraw(this,withdrawAmount);
        System.out.println(toString());
    }

    public String toString(){
        String output = "";
        output += "Account Number: " + getAccountNumber() + "\n"
                + "Current Balance: " + getBalance() + "\n";
        return output;
    }
}