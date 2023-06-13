package behavioralPattern.chainOfResponsibilityPattern.logger;

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    protected String write(String message) {
        return "console log" + message;
    }

}
