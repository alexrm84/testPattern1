package alexrm84.testPattern.utils;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class InfoMSG {
    private String pcName;
    private LocalDateTime dateTime;
    private Smart smart;
    private Temperature temperature;
}
