package object;

public class SubscriberEx {
    public static void main(String[] args) {
        SubscriberInfo subscriberInfo = new SubscriberInfo();

        // 속성 변경(초기화)
        // 1. 직접접근 : private 사용하면 불가
        // 2. 생성자
        // 3. set---()
        subscriberInfo.setName("홍");
        subscriberInfo.setId("123");
        subscriberInfo.changePassword("qwe1");
        subscriberInfo.changePhone("010-1234-1234");

        // 가입자 정보 조회
        // 1. 간단조회 : toString() => 개발자 확인용
        System.out.println(subscriberInfo);
        // 2. 개별조회 : get---()
        System.out.println("아이디 : " + subscriberInfo.getId());
    }
}
