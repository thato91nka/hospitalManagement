package za.co.thato.service.service.procedure;

import za.co.thato.domain.enitity.Procedure;

import java.util.List;

public interface ProcedureService {
    Procedure addProcedure(Procedure procedure);
    List<Procedure> getProcedures();
    Procedure getProcedure(String name);
}
