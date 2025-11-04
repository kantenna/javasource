package student2.repository;

import static student2.repository.JDBCUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import student2.dto.StudentDTO;

public class StudentDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public StudentDAO(Connection con) {
        this.con = con;
    }

    // insert
    public int insert(StudentDTO dto) {
        int result = 0;
        try {
            String sql = "INSERT INTO STUDENT(student_id, name, height, dept_id) VALUES(?,?,?,?)";
            pstmt = con.prepareStatement(sql);

            pstmt.setString(1, dto.getStudentId());
            pstmt.setString(2, dto.getStudentName());
            pstmt.setDouble(3, dto.getHeight());
            pstmt.setString(4, dto.getDeptId());
            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    // delete : studentID
    public int delete(String studentID) {
        int result = 0;
        try {
            String sql = "DELETE FROM STUDENT WHERE student_id = ?";
            pstmt = con.prepareStatement(sql);

            pstmt.setString(1, studentID);
            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    // update : height 수정
    public int update(StudentDTO dto) {
        int result = 0;
        try {
            String sql = "UPDATE STUDENT SET height = ? WHERE student_id = ?";
            pstmt = con.prepareStatement(sql);

            pstmt.setDouble(1, dto.getHeight());
            pstmt.setString(2, dto.getStudentId());
            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    // 학생전체조회(dept_id로 조회)
    public List<StudentDTO> getList(String deptId) {
        List<StudentDTO> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM STUDENT WHERE dept_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, deptId);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String studentId = rs.getString("student_id");
                String name = rs.getString("name");
                Double height = rs.getDouble("height");
                deptId = rs.getString("dept_id");

                list.add(new StudentDTO(studentId, name, height, deptId));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return list;
    }

    // 학생조회(id로 조회)
    public StudentDTO getRow(String studentId) {
        StudentDTO dto = null;
        try {
            String sql = "SELECT * FROM STUDENT WHERE student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                studentId = rs.getString("student_id");
                String name = rs.getString("name");
                Double height = rs.getDouble("height");
                String dept_id = rs.getString("dept_id");

                dto = new StudentDTO(studentId, name, height, dept_id);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return dto;
    }
}
