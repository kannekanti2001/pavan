package account;

public class AccountTestClass {
    public static void main(String[] args) {
        AccountService accountService=new AccountService();
        accountService.deposit("987654321",300);
        
    }
}
