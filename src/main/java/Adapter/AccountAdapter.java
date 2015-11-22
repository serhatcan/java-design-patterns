package Adapter;

/**
 * Created by Serhat CAN on 22.11.2015.
 */
public class AccountAdapter implements Copyable {

    private Account account;

    public AccountAdapter(Account account) {
        this.account = account;
    }

    public boolean isCopyable() {
        return account.isValid();
    }

}
