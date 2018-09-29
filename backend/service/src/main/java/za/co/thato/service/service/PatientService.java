package za.co.thato.service.service;

import java.util.List;
import za.co.thato.domain.enitity.Patient;
import za.co.thato.service.dto.PatientDTO;

public interface PatientService {

  List<PatientDTO> findAll();

  PatientDTO findPatient(long idNumber);

  PatientDTO updatePatient(long idNumber,Patient patient);

  PatientDTO createPatient(Patient patient);


}
