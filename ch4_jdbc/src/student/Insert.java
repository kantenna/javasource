package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("oracle.jdbc.OracleDriver"); // Oracle

            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "javadb";
            String password = "12345";

            con = DriverManager.getConnection(url, user, password);

            // 입력할 학생 아이디 입력받기
            System.out.print("아이디 입력 >> ");
            String studentID = sc.nextLine();
            System.out.print("이름 입력 >> ");
            String name = sc.nextLine();
            System.out.print("키 입력 >> ");
            Double height = Double.parseDouble(sc.nextLine());
            System.out.print("학과코드 입력 >> ");
            String deptId = sc.nextLine();

            String sql = "INSERT INTO STUDENT(student_id, name, height, dept_id) values(?, ?, ?, ?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentID);
            pstmt.setString(2, name);
            pstmt.setDouble(3, height);
            pstmt.setString(4, deptId);
            int rows = pstmt.executeUpdate();

            System.out.println(rows > 0 ? "입력성공" : "입력실패");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
