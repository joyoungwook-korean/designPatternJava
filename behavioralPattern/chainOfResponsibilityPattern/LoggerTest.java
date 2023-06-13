package behavioralPattern.chainOfResponsibilityPattern;

import org.junit.jupiter.api.Test;

import behavioralPattern.chainOfResponsibilityPattern.logger.AbstractLogger;
import behavioralPattern.chainOfResponsibilityPattern.logger.ConsoleLogger;
import behavioralPattern.chainOfResponsibilityPattern.logger.ErrorLogger;
import behavioralPattern.chainOfResponsibilityPattern.logger.FileLogger;

public class LoggerTest {

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    @Test
    public void loggerTest() {
        AbstractLogger logger = getChainOfLoggers();
        logger.logMessage(AbstractLogger.INFO, "info");
        logger.logMessage(AbstractLogger.ERROR, "error");
        logger.logMessage(AbstractLogger.DEBUG, "debug");

    }
}
