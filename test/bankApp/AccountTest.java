package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountTest {
 //   private Account mijuAccount = new Account("Ademiju Adam", "1234");
    Account mijuAccount;
@BeforeEach
public void startWithThis(){
    mijuAccount = new Account("Ademiju adam", "1234");
}
    @Test
    public void accountNameCanBeCreated() {
        Account mijuAccount = new Account("Ademiju Adam", "1234");
        String accountName = mijuAccount.getaccountName();
        assertEquals("Ademiju Adam", accountName);


    }

    @Test
    public void newAccountBalance() {
        Account mijuAccount = new Account("Ademiju Adam", "1234");
        int balance = mijuAccount.getbalance("1234");
        assertEquals(50_000, balance);
    }

    @Test
    public void addDeposit5kToAccount() {

        //given
        //when
        mijuAccount.deposit(5_000);
       // check
        int balance = mijuAccount.getbalance("1234");
        assertEquals(55_000,balance);
    }
    @Test
    public void checkNegativeAmount(){
        mijuAccount.deposit(-5_000);
        int balance = mijuAccount.getbalance("1234");
        assertEquals(50_000,balance);




    }
    @Test
    public  void withdraw5kBalanceIs45kUpdate(){
        mijuAccount.withdrawal(5_000,"1234");
        int withdraw = mijuAccount.getbalance("1234");
        assertEquals(45_000,withdraw);
    }
    @Test
    public void confirmNegativeWithdrawal(){
    mijuAccount.withdrawal(-5_000,"1234");
    int balance = mijuAccount.getbalance("1234");
    assertEquals(50_000,balance);

    }
    @Test
    public void withdrawalExtendedLimit(){
    mijuAccount.withdrawalExtendedLimit(95_000,"1234");
    int balance = mijuAccount.getbalance("1234");
    assertEquals(50_000,balance);
    }
}


