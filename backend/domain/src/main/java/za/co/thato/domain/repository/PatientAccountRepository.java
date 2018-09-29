package za.co.thato.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import za.co.thato.domain.enitity.Patient;

@Transactional
public interface PatientAccountRepository extends JpaRepository<Patient, Long> {

}