package alexrm84.testPattern;

import alexrm84.testPattern.utils.Smart;
import alexrm84.testPattern.utils.Temperature;

public interface DataCollector {
    Smart getSmart(String hddName);
    Temperature getTemperature();
}
