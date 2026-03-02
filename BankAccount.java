public class BankAccount {
    private String AccountNumber;
    private String Name;
    private double CurrentBalance;

    public BankAccount(String AccountNumber, String Name, double CurrentBalance){
        this.AccountNumber = AccountNumber;
        this.Name = Name;
        if ( CurrentBalance >= 0)
            this.CurrentBalance = CurrentBalance;
        else
            this.CurrentBalance = 0.0;
    };

    public void Deposit ( double deposit){
        if (deposit > 0.0)
            CurrentBalance += deposit;
        else
            System.out.println("Invalid Value");
    };

    public void Withdraw ( double withdraw){
        if (withdraw > 0.0 && withdraw <= CurrentBalance)
            CurrentBalance -= withdraw;
        else
            System.out.println("Invalid Value or current balance is not enough");
    };

    public double GetCurrentBalance (){
        return CurrentBalance;
    };

    public void display (){
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Name: " + Name);
        System.out.println("CurrentBalance : " + CurrentBalance);
    };
}
