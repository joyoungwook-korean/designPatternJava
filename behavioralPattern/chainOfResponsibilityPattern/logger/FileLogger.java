package behavioralPattern.chainOfResponsibilityPattern.logger;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected String write(String message) {
        return "file log" + message;
    }
}
