public class ActiveState implements AccountState{
    @Override
    public void deposit(Account account,Double depositAmount){
        Double balance = account.getBalance();
        balance += depositAmount;
        account.setBalance(balance);
    }
    @Override
    public void withdraw(Account account,Double withdrawAmount){
        Double balance = account.getBalance();
        balance -= withdrawAmount;
        account.setBalance(balance);
    }
    @Override
    public void suspend(Account account){
        System.out.println("Account is suspended!\n");
        account.setAccountState(new SuspendedState());
    }
    @Override
    public void activate(Account account){
        System.out.println("Account is already activated!\n");
    }
    @Override
    public void close(Account account){
        System.out.println("Account is closed!\n");
        account.setAccountState(new ClosedState());
    }
}