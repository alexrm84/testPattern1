package alexrm84.testPattern;

import alexrm84.testPattern.entities.InfoMSG;
import alexrm84.testPattern.entities.Smart;
import alexrm84.testPattern.entities.Temperature;

import java.time.LocalDateTime;

public class CollectorFacade extends MySubject {
    private DataCollector dataCollector;
    private Network network;
    private InfoMSG msg;

    public CollectorFacade(){
        dataCollector = CreationFactory.getInstance().getDataCollector();
        network = CreationFactory.getInstance().getNetwork();
        msg = new InfoMSG();
    }

     public void collectAndSendInfo() {
         msg.setDateTime(LocalDateTime.now());
         msg.setPcName("pc1");
         msg.setSmart((Smart) dataCollector.getData(EnumData.SMART));
         msg.setTemperature((Temperature)dataCollector.getData(EnumData.TEMPERATURE));
         network.sendInfo(msg);
         notify("the data has been collected and send");
     }
}
