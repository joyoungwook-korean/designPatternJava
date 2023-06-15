package behavioralPattern.observerPattern.observer;

import behavioralPattern.observerPattern.entity.Subject;

public class AAObserver extends Observer {

    public AAObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("AA Observer");
    }

}
