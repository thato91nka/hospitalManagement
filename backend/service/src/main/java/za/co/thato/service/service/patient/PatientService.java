package za.co.thato.service.service.patient;

import za.co.thato.domain.enitity.Patient;
import za.co.thato.service.dto.PatientDTO;
import za.co.thato.service.dto.ProcedureDTO;

import java.util.List;

public interface PatientService {

  List<PatientDTO> findAll();

  PatientDTO findPatient(long idNumber);

  PatientDTO updatePatient(long idNumber, Patient patient);

  PatientDTO createPatient(Patient patient);

  List<ProcedureDTO> performedProcedures(long idNumber);
}
