package alexrm84.testPattern;

public class CreationFactory {
    private final DataCollector DATA_COLLECTOR = new DataCollectorImpl();
    private final Network NETWORK = new NetworkImpl();
    private static volatile CreationFactory instance;
    private CreationFactory(){}
    public static CreationFactory getInstance() {
        if (instance == null) {
            synchronized (CreationFactory.class) {
                if (instance == null) {
                    instance = new CreationFactory();
                }
            }
        }
        return instance;
    }

    public DataCollector getDataCollector() {
        return DATA_COLLECTOR;
    }

    public Network getNetwork(){
        return NETWORK;
    }
}
