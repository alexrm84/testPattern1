package alexrm84.testPattern;

import alexrm84.testPattern.observers.MyObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class MySubject {
    private List<MyObserver> observerList = new ArrayList<>();

    public void attach(MyObserver observer){
        observerList.add(observer);
    }

    public void detach(MyObserver observer){
        observerList.remove(observer);
    }

    public void notify(Object obj){
        for (MyObserver mo: observerList) {
            mo.update(this, obj);
        }
    }
}
