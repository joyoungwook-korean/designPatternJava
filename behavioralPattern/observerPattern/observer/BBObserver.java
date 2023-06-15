package behavioralPattern.observerPattern.observer;

import behavioralPattern.observerPattern.entity.Subject;

public class BBObserver extends Observer {

    public BBObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("BBObserver");
    }

}
