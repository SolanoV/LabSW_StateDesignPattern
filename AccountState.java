public interface AccountState {
    public void deposit(double depositAmount, Account account);
    public void withdraw(double withdrawAmount, Account account);
    public void activate();
    public void suspend();
    public void close();

}
