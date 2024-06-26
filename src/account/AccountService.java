package account;

public class AccountService {

    public double deposit(String accountNO,int amount){
        AccountDetails accountDetails=new AccountDetails();
        accountDetails.Name="pavan";
        accountDetails.accountNumber="987654321";
        accountDetails.balance=7000;

        if (accountNO.equals(accountDetails.accountNumber)) {
            accountDetails.balance = accountDetails.balance + amount;
            System.out.println(accountDetails.balance);
        }
        return accountDetails.balance;

    }
}
