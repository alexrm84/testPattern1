package alexrm84.testPattern;

public class CreationFactory {
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

    public DataCollector createDataCollector() {
        return new DataCollectorImpl();
    }

    public Network createNetwork(){
        return new NetworkImpl();
    }
}
