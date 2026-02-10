public class ClosedState implements AccountState{

    @Override
    public void deposit(double depositAmount, Account account) {
        System.out.println("You can not deposit on a closed account!\n");
    }

    @Override
    public void withdraw(double withdrawAmount, Account account) {
        System.out.println("You can not withdraw on a closed account!\n");
    }

    @Override
    public void activate() {
        System.out.println("You can not activate a closed account!\n");
    }

    @Override
    public void suspend() {
        System.out.println("You can not suspend a closed account!\n");
    }

    @Override
    public void close() {
        System.out.println("Account is already closed!\n");
    }

}
