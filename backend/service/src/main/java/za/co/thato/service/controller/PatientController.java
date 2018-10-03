package za.co.thato.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import za.co.thato.domain.enitity.Patient;
import za.co.thato.service.dto.PatientDTO;
import za.co.thato.service.dto.ProcedureDTO;
import za.co.thato.service.service.patient.PatientServiceImpl;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class PatientController {

    @Autowired
    PatientServiceImpl patientService;

    @PostMapping("/patients")
    public PatientDTO create(@RequestBody Patient patient) {
        return patientService.createPatient(patient);
    }

    @GetMapping(path = {"/{id}"})
    public PatientDTO findOne(@PathVariable("id") long id) {
        return patientService.findPatient(id);
    }

    @GetMapping("/patients")
    public List<PatientDTO> getAllPatients() {
        return patientService.findAll();
    }

    @PutMapping("/patient/{id}")
    public PatientDTO updateNote(@PathVariable(value = "id") Long id,
                                 @Valid @RequestBody Patient patient) {
        return patientService.updatePatient(id, patient);
    }

    @RequestMapping(value = "patients/procedures/{idNumber}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ProcedureDTO> getAllProcedured(@PathVariable(value = "idNumber") Long idNumber) {
        return patientService.performedProcedures(idNumber);
    }

}
