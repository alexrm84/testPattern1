package alexrm84.testPattern;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        DataCollector dataCollector = CreationFactory.getInstance().createDataCollector();
        Network network = CreationFactory.getInstance().createNetwork();
        InfoMSG msg = new InfoMSG();
        msg.setDateTime(LocalDateTime.now());
        msg.setPcName("pc1");
        msg.setSmart((Smart) dataCollector.getData(EnumData.SMART));
        msg.setTemperature((Temperature)dataCollector.getData(EnumData.TEMPERATURE));
        network.sendInfo(msg);
    }
}
