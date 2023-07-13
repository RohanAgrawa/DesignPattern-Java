public class BankAccount {
    // write the code of bank account class here

    String accountNumber;

    int balance;

    double roi;

    double getSimpleInterest(int years){

        return  (balance * roi * years) / 100;
    }

    double getBalanceWithInterest(int years)
    {
        return balance + ((balance * roi * years) / 100);
    }

}
