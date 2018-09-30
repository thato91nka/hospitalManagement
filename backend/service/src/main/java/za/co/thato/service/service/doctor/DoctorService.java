package za.co.thato.service.service.doctor;

import za.co.thato.domain.enitity.Doctor;
import za.co.thato.service.dto.DoctorDTO;
import za.co.thato.service.dto.ProcedureDTO;

import java.util.List;

public interface DoctorService {

    List<DoctorDTO> findAll();

    DoctorDTO findDoctor(String empNum);

    DoctorDTO createDoctor(Doctor doctor);

    List<ProcedureDTO> performedProcedures(String empNum);
}
