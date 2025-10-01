package inheritance;

public class CreditLineAccount extends Account {
    // 마이너스 한도 : 100000(예금액) + 5000000
    private int minus;

    public CreditLineAccount(String accountNo, String owner, long balance, int minus) {
        super(accountNo, owner, balance);
        // TODO Auto-generated constructor stub
    }

    // 출금 : 예금액 + 마이너스 한도
    @Override
    long withdraw(long amount) throws Exception {
        // TODO Auto-generated method stub
        return super.withdraw(amount);
    }
    // withdraw override
}
