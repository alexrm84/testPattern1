package alexrm84.testPattern;


import alexrm84.testPattern.entities.InfoMSG;

public interface Network {
    boolean sendInfo(InfoMSG infoMSG);
    void sendEMail(String str);
    String receive();
}
