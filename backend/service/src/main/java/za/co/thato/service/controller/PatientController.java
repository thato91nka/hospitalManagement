package za.co.thato.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.thato.domain.enitity.Patient;
import za.co.thato.service.dto.PatientDTO;

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

  /*
  TO-DO
  Implement update and delete
   */


}
