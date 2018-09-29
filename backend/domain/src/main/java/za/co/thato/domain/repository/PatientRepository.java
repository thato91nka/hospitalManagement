package za.co.thato.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import za.co.thato.domain.enitity.Patient;

/**
 * Created by A222186 on 2018/08/29.
 */
@Transactional
public interface PatientRepository extends JpaRepository<Patient, Long> {
  Patient findByIdNumber(long idNumber);
}
