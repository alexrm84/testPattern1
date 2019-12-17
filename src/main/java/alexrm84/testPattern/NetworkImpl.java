package alexrm84.testPattern;

import alexrm84.testPattern.entities.InfoMSG;

public class NetworkImpl implements Network {
    @Override
    public boolean sendInfo(InfoMSG infoMSG) {
        return false;
    }

    @Override
    public String receive() {
        return null;
    }

    @Override
    public void sendEMail(String str){
        System.out.println(str);
    }

    private void start(){}

    private void stop(){}
}
