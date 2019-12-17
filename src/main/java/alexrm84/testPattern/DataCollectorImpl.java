package alexrm84.testPattern;

import alexrm84.testPattern.entities.Smart;
import alexrm84.testPattern.entities.Temperature;

public class DataCollectorImpl implements DataCollector {
    private DataSet dataSet;

    @Override
    public DataSet getData(EnumData enumData) {
        switch (enumData) {
            case SMART: dataSet = new Smart();
            case TEMPERATURE: dataSet = new Temperature();
        }
        return dataSet;
    }
}
