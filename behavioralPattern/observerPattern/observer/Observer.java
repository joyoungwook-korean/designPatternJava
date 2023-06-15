package behavioralPattern.observerPattern.observer;

import behavioralPattern.observerPattern.entity.Subject;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
