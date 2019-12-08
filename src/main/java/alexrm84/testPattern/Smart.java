package alexrm84.testPattern;

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
