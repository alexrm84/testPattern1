package alexrm84.testPattern.observers;

import alexrm84.testPattern.CreationFactory;
import alexrm84.testPattern.MySubject;
import alexrm84.testPattern.Network;

public class Operator implements MyObserver {
    private Network network = CreationFactory.getInstance().getNetwork();

    @Override
    public void update(MySubject mySubject, Object object) {
        if (object instanceof String) {
            network.sendEMail("Dear user, " + (String)object);
        }
    }
}
