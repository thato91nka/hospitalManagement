package za.co.thato.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.thato.domain.enitity.Doctor;
import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {
    List<Doctor> findAllByName(String name);
    List<Doctor> findAllBySpeciality(String speciality);

}
