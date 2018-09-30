package za.co.thato.domain.enitity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="patients")
@Data
public class Patient extends BaseEntityAudit {
  @NotNull
  private String name;
  @NotNull
  private String surname;
  private String cellNumber;
  private String email;
  @NotNull
  private String bloodType;

  @Column(unique=true)
  private long idNumber;

  /*@OneToOne(fetch = FetchType.LAZY,
          cascade =  CascadeType.ALL,
          mappedBy = "patient")*/
  private PatientAccount patientAccount;

}
