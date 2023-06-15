package behavioralPattern.observerPattern.observer;

import behavioralPattern.observerPattern.entity.Subject;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary");
    }

}
