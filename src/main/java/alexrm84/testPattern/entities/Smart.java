package alexrm84.testPattern.entities;

import alexrm84.testPattern.DataSet;
import lombok.Data;

@Data
public class Smart implements DataSet {
    private String hddName;
    private int rowReadErrorRate;
    private int throughputPerformance;
    private int spinUpTime;

    @Override
    public void info() {
        System.out.println("Name=" + this.getClass());
    }

}
