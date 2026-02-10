public class ActivateState implements AccountState {

    @Override
    public void deposit(double depositAmount, Account account) {
        System.out.println("You have deposited +"+depositAmount);
        account.setBalance(account.getBalance()+depositAmount);
    }

    @Override
    public void withdraw(double withdrawAmount, Account account) {
        System.out.println("You have withdrawn -"+withdrawAmount);
        account.setBalance(account.getBalance()-withdrawAmount);
    }

    @Override
    public void activate() {
        System.out.println("Account is already activated!\n");
    }

    @Override
    public void suspend() {
        System.out.println("Account is suspended!\n");
    }

    @Override
    public void close() {
        System.out.println("Account is closed!\n");
    }
}
