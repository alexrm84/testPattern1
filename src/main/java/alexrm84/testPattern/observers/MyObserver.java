package alexrm84.testPattern.observers;

import alexrm84.testPattern.MySubject;

public interface MyObserver {
    void update(MySubject mySubject, Object object);
}
