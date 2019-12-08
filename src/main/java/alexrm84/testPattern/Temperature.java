package alexrm84.testPattern;

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
