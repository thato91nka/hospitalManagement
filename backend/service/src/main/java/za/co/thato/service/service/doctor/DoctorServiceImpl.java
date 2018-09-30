package za.co.thato.service.service.doctor;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.thato.domain.enitity.Doctor;
import za.co.thato.domain.enitity.Procedure;
import za.co.thato.domain.repository.DoctorRepository;
import za.co.thato.domain.repository.ProcedureRepository;
import za.co.thato.service.dto.DoctorDTO;
import za.co.thato.service.dto.PatientDTO;
import za.co.thato.service.dto.ProcedureDTO;

import java.util.List;

/**
 * Created by thato on 2018/09/29.
 */
@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    ProcedureRepository procedureRepository;

    @Autowired
    ModelMapper mapper;

    @Override
    public List<DoctorDTO> findAll() {
        List<Doctor> all = doctorRepository.findAll();
        java.lang.reflect.Type targetListType = new TypeToken<List<DoctorDTO>>() {
        }.getType();
        return mapper.map(all, targetListType);
    }

    @Override
    public DoctorDTO findDoctor(String emplNum) {
        Doctor byEmployeeNum = doctorRepository.findByEmployeeNum(emplNum);
        return mapper.map(byEmployeeNum,DoctorDTO.class);
    }

    @Override
    public DoctorDTO createDoctor(Doctor doctor) {
        Doctor dr = doctorRepository.save(doctor);
        return mapper.map(dr,DoctorDTO.class);
    }

    @Override
    public List<ProcedureDTO> performedProcedures(String emplNum) {
        Doctor byEmployeeNum = doctorRepository.findByEmployeeNum(emplNum);
        List<Procedure> allByDoctor = procedureRepository.findAllByDoctor(byEmployeeNum);
        java.lang.reflect.Type targetListType = new TypeToken<List<ProcedureDTO>>() {
        }.getType();
        return mapper.map(allByDoctor, targetListType);
    }
}
