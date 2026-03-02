import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BankAccount a1;
        System.out.println("Enter Your Account Number: ");
        String AccNum = input.nextLine();
        System.out.println("Enter Your Name: ");
        String Nam = input.nextLine();
        System.out.println("Enter Your Current Balance: ");
        double Bal = input.nextDouble();

        a1 = new BankAccount( AccNum, Nam, Bal );

        int choice;

        do {
            System.out.println("\n1- Deposit");
            System.out.println("2- Withdraw");
            System.out.println("3- Check Balance");
            System.out.println("4- Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    a1.Deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    a1.Withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Current Balance: " + a1.GetCurrentBalance());
                    break;

                case 4:
                    System.out.println("Thank you for using our bank system.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 4);

        input.close();
    }
}