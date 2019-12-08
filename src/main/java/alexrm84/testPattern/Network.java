package alexrm84.testPattern;


public interface Network {
    boolean sendInfo(InfoMSG infoMSG);
    String receive();
}
