package alexrm84.testPattern;


import alexrm84.testPattern.utils.InfoMSG;

public interface Network {
    boolean sendInfo(InfoMSG infoMSG);
    String receive();
}
