package za.co.thato.service.service.doctor;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import za.co.thato.domain.enitity.Doctor;
import za.co.thato.domain.repository.DoctorRepository;
import za.co.thato.service.dto.DoctorDTO;
import za.co.thato.service.dto.PatientDTO;

import java.util.List;

/**
 * Created by thato on 2018/09/29.
 */
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

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
    public DoctorDTO findDoctor(String surname) {
       return null;
    }

    @Override
    public DoctorDTO createDoctor(Doctor doctor) {
        return null;
    }

    @Override
    public List<PatientDTO> treatedPatients(String name) {
        return null;
    }
}
