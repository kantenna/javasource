package lang;

public class LoginEx {
    public static void main(String[] args) {
        try {
            login("white", "12345");
            login("blue", "54321");
        } catch (WrongPasswordException | NotExistIDException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
        if (!id.equals("blue")) {
            // id가 blue가 아니라면 NotExistIDException 발생
            throw new NotExistIDException("ID를 확인하세요");
        }

        if (!password.equals("12345")) {
            // password가 "12345"가 아니라면 WrongPasswordException 발생
            throw new WrongPasswordException("Password를 확인하세요");
        }
    }
}
