package za.co.thato.service.service.procedure;

import za.co.thato.domain.enitity.Procedure;
import za.co.thato.service.dto.ProcedureDTO;

import java.util.List;

public interface ProcedureService {
    ProcedureDTO addProcedure(Procedure procedure, Long patientID, String emplNum);
    List<ProcedureDTO> getProcedures();
    ProcedureDTO getProcedure(String name);
}
