package za.co.thato.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.thato.domain.enitity.Doctor;
import za.co.thato.domain.enitity.Patient;
import za.co.thato.domain.enitity.Procedure;

import java.util.Date;
import java.util.List;

public interface ProcedureRepository extends JpaRepository<Procedure,Long> {
    List<Procedure> findAllByDate(Date date);
    List<Procedure> findAllByPatient(Patient patient);
    List<Procedure> findAllByDoctor(Doctor doctor);
}
