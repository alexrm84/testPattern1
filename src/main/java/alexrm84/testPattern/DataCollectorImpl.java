package alexrm84.testPattern;

import alexrm84.testPattern.utils.Smart;
import alexrm84.testPattern.utils.Temperature;

public class DataCollectorImpl implements DataCollector {
    private Smart smart;
    private Temperature temperature;

    @Override
    public Smart getSmart(String hddName) {
        return null;
    }

    @Override
    public Temperature getTemperature() {
        return null;
    }
}
