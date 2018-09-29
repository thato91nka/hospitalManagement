package za.co.thato.service.service.patient;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.thato.domain.enitity.Patient;
import za.co.thato.domain.repository.PatientRepository;
import za.co.thato.service.dto.PatientDTO;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    ModelMapper mapper;


    @Override
    public List<PatientDTO> findAll() {
        List<Patient> patients = patientRepository.findAll();
        java.lang.reflect.Type targetListType = new TypeToken<List<PatientDTO>>() {
        }.getType();
        List<PatientDTO> patientDTO = mapper.map(patients, targetListType);
        return patientDTO;
    }

    @Override
    public PatientDTO findPatient(long idNumber) {
        Patient byIdNumber = patientRepository.findByIdNumber(idNumber);
        return mapper.map(byIdNumber, PatientDTO.class);
    }

    @Override
    public PatientDTO updatePatient(long id,Patient patientDetails) {
        Patient patient = patientRepository.findByIdNumber(id);
        patient.setEmail(patientDetails.getEmail());
        patient.setCellNumber(patientDetails.getCellNumber());
        return mapper.map(patient, PatientDTO.class);
    }

    @Override
    public PatientDTO createPatient(Patient patient) {
        Patient save = patientRepository.save(patient);
        return mapper.map(save, PatientDTO.class);
    }
}

