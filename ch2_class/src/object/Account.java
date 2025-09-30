package object;

// private : 해당 클래스내에서만 접근 가능
public class Account {
    // 은행 계좌
    // 계좌번호(120-12-111), 계좌주(홍길동), 잔액(100000)
    private String accountNo;
    private String owner;
    private long balance;

    public Account(String accountNo, String owner, long balance) {
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
    }

    // 입금(잔액 = 잔액 + 입금액) => 입금액을 인자로 받아 처리, 리턴 타입 없음
    void deposit(long amount) {
        balance += amount;
    }

    // 출금(잔액 = 잔액 - 출금액) => 출금액을 인자로 받아 처리, 전액 리턴
    long withdraw(long amount) {
        return balance -= amount;
    }

    // 속성 값 조회 : get---
    public long getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public String getAccountNo() {
        return accountNo;
    }
}
