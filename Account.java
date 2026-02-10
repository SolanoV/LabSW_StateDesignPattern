public class Account {
    private String accountNumber;
    private double balance;
    private AccountState accountState;

    public Account(){
        this.accountState=new ActivateState();
    }
    public Account(String accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.accountState=new ActivateState();
    }

    public AccountState getAccountState(){
        return accountState;
    }

    public void setState(AccountState accountState){
        this.accountState=accountState;
    }
    
    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public void deposit(double depositAmount){
        accountState.deposit(depositAmount, this);
        toStrings();
    }

    public void withdraw(double withdrawAmount){
        accountState.withdraw(withdrawAmount, this);
        toStrings();
    }

    public void activate(){
        accountState.activate();
        setState(new ActivateState());
    }

    public void suspend(){
        accountState.suspend();
        setState(new SuspendedState());
    }

    public void close(){
        accountState.close();
        setState(new ClosedState());
    }

    public void toStrings(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance+"\n");
    }
}
