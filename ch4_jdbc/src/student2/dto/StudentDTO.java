package student2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {
    // 테이블 모양
    private String studentId;
    private String studentName;
    private Double height;
    private String deptId;
}
