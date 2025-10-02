package inheritance;

public class CreditLineAccount extends Account {
    // 마이너스 한도 : 100000(예금액) + 5000000
    private int creditLine;

    public CreditLineAccount(String accountNo, String owner, long balance, int creditLine) {
        super(accountNo, owner, balance);
        this.creditLine = creditLine;
    }

    // 출금 : (잔액 + 마이너스 한도) - 사용액
    // withdraw override
    @Override
    long withdraw(long amount) throws Exception {

        if (super.getBalance() + creditLine < amount) {
            throw new Exception("마이너스 한도 확인");
        }
        setBalance(getBalance() - amount);
        return super.getBalance();
    }
}
