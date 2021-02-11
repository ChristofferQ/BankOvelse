import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Customer c1;
    Account account;


    @BeforeEach
    void setUp() {
        c1 = new Customer("Jon");
        account = new Account(c1);
    }

    @Test
    void getCustomer() {
    }

    @Test
    void getBalance() {
    }

    @Test
    void withDrawAmount() {
    }

    @Test
    void depositAmount() {
       int expected = 30;
       account.depositAmount(10);
       System.out.println(account.depositAmount(10));
       int actual = account.depositAmount(10);
       assertEquals(expected, actual);
    }

    @Test
    void getTransactions() {
    }
}