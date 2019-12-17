package alexrm84.testPattern.entities;

import alexrm84.testPattern.DataSet;
import lombok.Data;

@Data
public class Temperature implements DataSet {
    private int cpuTemp;
    private  int systemTemp;
    private int vgaTemp;

    @Override
    public void info() {
        System.out.println("Name=" + this.getClass());
    }
}
