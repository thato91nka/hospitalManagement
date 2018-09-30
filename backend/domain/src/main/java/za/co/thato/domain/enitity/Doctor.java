package za.co.thato.domain.enitity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="doctors")
@Data
public class Doctor extends BaseEntityAudit {
    private String name;
    private String speciality;
    private String cell;
    private String email;
    @Column(unique=true)
    private String employeeNum;

}
