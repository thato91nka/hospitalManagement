package za.co.thato.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.thato.domain.enitity.Procedure;
import za.co.thato.service.dto.ProcedureDTO;
import za.co.thato.service.service.procedure.ProcedureService;

@RestController
@RequestMapping("/api")
public class ProcedureController {

    @Autowired
    ProcedureService procedureService;

    @PostMapping("/procedure/{id}/{emplNum}")
    public ProcedureDTO create(@RequestBody Procedure procedure, @PathVariable Long id, @PathVariable String emplNum) {
        return procedureService.addProcedure(procedure,id,emplNum);
    }
}
