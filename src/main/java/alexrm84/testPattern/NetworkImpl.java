package alexrm84.testPattern;

public class NetworkImpl implements Network {
    @Override
    public boolean sendInfo(InfoMSG infoMSG) {
        return false;
    }

    @Override
    public String receive() {
        return null;
    }

    private void start(){}

    private void stop(){}
}
