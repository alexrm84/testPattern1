package alexrm84.testPattern;


public interface Network {
    boolean sendInfo(InfoMSG infoMSG);
    void sendEMail(String str);
    String receive();
}
