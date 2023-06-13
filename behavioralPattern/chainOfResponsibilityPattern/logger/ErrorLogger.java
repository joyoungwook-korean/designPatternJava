package behavioralPattern.chainOfResponsibilityPattern.logger;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    protected String write(String message) {
        return "error log" + message;
    }
}
