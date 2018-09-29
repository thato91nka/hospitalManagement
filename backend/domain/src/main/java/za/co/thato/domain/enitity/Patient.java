package za.co.thato.domain.enitity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

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
