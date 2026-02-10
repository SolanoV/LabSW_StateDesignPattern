public class SuspendedState implements AccountState{      

    @Override
    public void deposit(double depositAmount, Account account) {
        System.out.println("You can not deposit on a suspended account!\n");
    }

    @Override
    public void withdraw(double withdrawAmount, Account account) {
        System.out.println("You can not withdraw on a suspended account!\n");
    }

    @Override
    public void activate() {
        System.out.println("Account is activated!\n");
    }
        

    @Override
    public void suspend() {
       System.out.println("Account is already suspended!\n");
    }

    @Override
    public void close() {
        System.out.println("Account is closed!\n");
    }


}
