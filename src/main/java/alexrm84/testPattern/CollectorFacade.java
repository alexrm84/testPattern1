package alexrm84.testPattern;

import java.time.LocalDateTime;

public class CollectorFacade {
    private DataCollector dataCollector;
    private Network network;
    private InfoMSG msg;

    public CollectorFacade(){
        dataCollector = CreationFactory.getInstance().createDataCollector();
        network = CreationFactory.getInstance().createNetwork();
        msg = new InfoMSG();
    }

     public void collectAndSendInfo() {
         msg.setDateTime(LocalDateTime.now());
         msg.setPcName("pc1");
         msg.setSmart((Smart) dataCollector.getData(EnumData.SMART));
         msg.setTemperature((Temperature)dataCollector.getData(EnumData.TEMPERATURE));
         network.sendInfo(msg);
     }
}
