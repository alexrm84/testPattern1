package alexrm84.testPattern.observers;

import alexrm84.testPattern.CreationFactory;
import alexrm84.testPattern.MySubject;
import alexrm84.testPattern.Network;

import java.time.LocalDateTime;

public class SystemUser implements MyObserver {
    private Network network = CreationFactory.getInstance().getNetwork();

    @Override
    public void update(MySubject mySubject, Object object) {
        if (object instanceof String) {
            network.sendEMail((String)object + " on " + LocalDateTime.now());
        }
    }
}
