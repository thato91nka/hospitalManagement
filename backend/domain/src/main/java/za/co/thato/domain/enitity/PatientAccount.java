package za.co.thato.domain.enitity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="patient_account")
@Data
public class PatientAccount extends BaseEntityAudit {

  /*@OneToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "patient_id", nullable = false)*/
  private Patient patient;

}
