import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {

    private List<Transaction> transactions;
    private Customer customer;

    public Account(Customer customer) {
        this.transactions = new ArrayList<>();
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getBalance(){
        // TODO: skal debugges
        int sum = 0;
        for (Transaction transaction : transactions) {
            sum += transaction.getAmount();
        }
        return sum;
    }

    public int withDrawAmount(int amount){
        // TODO: skal kodes og returnere ny saldo. Smid fejl hvis amount > saldo
        return 0;
    }

    public int depositAmount(int amount) {
        try {
            if (amount <= 0) {
                throw new Exception();
            } else {
                transactions.add(new Transaction(amount, new Date()));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return getBalance();
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
