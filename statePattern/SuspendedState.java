public class SuspendedState implements AccountState{
    @Override
    public void deposit(Account account,Double depositAmount){
        System.out.println("You cannot deposit on a suspended account!\n");
    }
    @Override
    public void withdraw(Account account,Double withdrawAmount){
        System.out.println("You cannot withdraw on a suspended account!\n");
    }
    @Override
    public void suspend(Account account){
        System.out.println("Account is already suspended!\n");
    }
    @Override
    public void activate(Account account){
        System.out.println("Account is activated!\n");
        account.setAccountState(new ActiveState());
    }
    @Override
    public void close(Account account){
        System.out.println("Account is closed!\n");
        account.setAccountState(new ClosedState());
    }
}