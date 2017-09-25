package personal.nathan.chainOfResponsibility.codes;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2017/9/24.
 */
public class ChainDemoMain {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an info level information.");

        //loggerChain.logMessage(AbstractLogger.DEBUG,
        //        "This is an debug level information.");

        //loggerChain.logMessage(AbstractLogger.ERROR,
        //        "This is an error level information.");
    }
}
