package za.co.thato.domain.enitity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="procedures")
@Data
public class Procedure extends BaseEntityAudit {

    private String name;
    private String cost;
    private String type;
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="patient_id")
    @JsonIgnore
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="doctor_id")
    @JsonIgnore
    private Doctor doctor;
}

