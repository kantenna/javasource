package inheritance;

public class AccountEx {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("111", "홍길동", 100000, "111-22");

        // 입금
        checkingAccount.deposit(200000);
        // 입금 후 잔액
        System.out.println("잔액 : " + checkingAccount.getBalance());
        // 직불카드 사용
        try {
            System.out.println("체크카드 지불후 잔액 : " + checkingAccount.pay("111-22", 400000));
        } catch (Exception e) {
            e.printStackTrace();
        }

        CreditLineAccount creditLineAccount = new CreditLineAccount("333", "길동", 100000, 5000000);
        try {
            System.out.println("잔액 : " + creditLineAccount.withdraw(3000000));
            System.out.println("잔액 : " + creditLineAccount.withdraw(3000000));

        } catch (Exception e) {
            e.printStackTrace();
        }

        BonusPointAccount bonusPointAccount = new BonusPointAccount("222", "성춘향", 0, 0);
        bonusPointAccount.deposit(300000);
        System.out.println("보너스 포인트 : " + bonusPointAccount.getBonusPoint());

    }
}
