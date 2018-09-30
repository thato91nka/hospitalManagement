package za.co.thato.service.service.procedure;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.thato.domain.enitity.Doctor;
import za.co.thato.domain.enitity.Patient;
import za.co.thato.domain.enitity.Procedure;
import za.co.thato.domain.repository.DoctorRepository;
import za.co.thato.domain.repository.PatientRepository;
import za.co.thato.domain.repository.ProcedureRepository;
import za.co.thato.service.dto.ProcedureDTO;

import java.util.List;

@Service
public class ProcedureImpl implements ProcedureService {

    @Autowired
    ProcedureRepository procedureRepository;

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    ModelMapper mapper;

    @Override
    public ProcedureDTO addProcedure(Procedure procedure,Long patientID, String emplNum) {
        Patient patient = patientRepository.findByIdNumber(patientID);
        procedure.setPatient(patient);
        Doctor doctor = doctorRepository.findByEmployeeNum(emplNum);
        procedure.setDoctor(doctor);
        Procedure pro = procedureRepository.save(procedure);
       return mapper.map(pro,ProcedureDTO.class);
    }

    @Override
    public List<ProcedureDTO> getProcedures() {
        return null;
    }

    @Override
    public ProcedureDTO getProcedure(String name) {
        return null;
    }
}
