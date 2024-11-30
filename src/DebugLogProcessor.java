public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor nextProcessor){
        super(nextProcessor);
    }

    public void processLog(int logLevel,String message) {
        if(logLevel==DEBUG){
            System.out.println("Debug: "+message);
        }else{
            super.log(logLevel,message);
        }
    }
}
