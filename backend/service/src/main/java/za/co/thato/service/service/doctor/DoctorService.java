package za.co.thato.service.service.doctor;

import za.co.thato.domain.enitity.Doctor;
import za.co.thato.service.dto.DoctorDTO;

import javax.print.Doc;
import java.util.List;

public interface DoctorService {

    List<DoctorDTO> findAll();

    DoctorDTO findDoctor(String surname);

    DoctorDTO createDoctor(Doctor doctor);
}