package za.co.thato.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import za.co.thato.domain.enitity.Doctor;
import za.co.thato.service.dto.DoctorDTO;
import za.co.thato.service.dto.PatientDTO;
import za.co.thato.service.dto.ProcedureDTO;
import za.co.thato.service.service.doctor.DoctorService;
import za.co.thato.service.service.doctor.DoctorServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DoctorController {

    @Autowired
    DoctorServiceImpl doctorService;


    @RequestMapping(value = "doctors/procedures/{employeeNum}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ProcedureDTO> getAllProcedured(@PathVariable(value = "employeeNum") String emplnum) {
        return doctorService.performedProcedures(emplnum);
    }

    @PostMapping("/doctor")
    public DoctorDTO create(@RequestBody Doctor doctor) {
        return doctorService.createDoctor(doctor);
    }

    @GetMapping("/doctor")
    public List<DoctorDTO> getAllPatients() {
        return doctorService.findAll();
    }

}
