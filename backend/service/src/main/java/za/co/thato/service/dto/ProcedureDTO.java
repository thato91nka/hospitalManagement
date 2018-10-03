package za.co.thato.service.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ProcedureDTO {
    private String name;
    private String cost;
    private String type;
    private Date date;
}
