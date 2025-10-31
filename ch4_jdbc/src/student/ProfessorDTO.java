package student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// ~~DTO(Data Transfer Object) == ~~VO(Value Object)

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProfessorDTO {
    private String profId;
    private String profname;
    private String deptId;

    // 생성자
    // public ProfessorDTO() {
    // }

    // public ProfessorDTO(String profId, String profname, String deptId) {
    // this.profId = profId;
    // this.profname = profname;
    // this.deptId = deptId;
    // }

    // // getter, setter, toString
    // public String getProfId() {
    // return profId;
    // }

    // public void setProfId(String profId) {
    // this.profId = profId;
    // }

    // public String getProfname() {
    // return profname;
    // }

    // public void setProfname(String profname) {
    // this.profname = profname;
    // }

    // public String getDeptId() {
    // return deptId;
    // }

    // public void setDeptId(String deptId) {
    // this.deptId = deptId;
    // }

    // @Override
    // public String toString() {
    // return "ProfessorDTO [profId=" + profId + ", profname=" + profname + ",
    // deptId=" + deptId + "]";
    // }

}
