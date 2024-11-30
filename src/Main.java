public class Main {
    public static void main(String[] args) {

        LogProcessor logObj=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObj.log(LogProcessor.INFO,"This is an information message");
        logObj.log(LogProcessor.DEBUG,"This is a debug message");
        logObj.log(LogProcessor.ERROR,"This is an error message");
    }
}