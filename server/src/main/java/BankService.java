import java.util.Date;
import java.util.List;

public class BankService {
    public BankService() {}

    public double converstion(double amount) {
        return amount * 11;
    }

    public Account getAccount(int code) {
        return new Account(code,new Date(),Math.random()*10000);
    }

    public List<Account> getAccountList(){
        return  List.of(
                new Account(1,new Date(),Math.random()*10000),
                new Account(2,new Date(),Math.random()*10000),
                new Account(3,new Date(),Math.random()*10000)
        );
    }
}
