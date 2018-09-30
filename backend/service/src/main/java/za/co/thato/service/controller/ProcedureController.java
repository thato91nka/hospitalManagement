package za.co.thato.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.thato.domain.enitity.Procedure;
import za.co.thato.service.dto.ProcedureDTO;
import za.co.thato.service.service.procedure.ProcedureService;

@RestController
@RequestMapping("/api")
public class ProcedureController {

    @Autowired
    ProcedureService procedureService;

    @PostMapping("/procedure/{id}/{emplNum}")
    public ProcedureDTO create(@RequestBody Procedure procedure) {
        return procedureService.addProcedure(procedure);
    }
}
