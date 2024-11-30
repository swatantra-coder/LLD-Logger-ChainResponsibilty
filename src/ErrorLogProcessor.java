public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    public void processLog(int loglevel,String message) {
        if(loglevel==ERROR){
            System.out.println("Error: "+message);
        }else{
            super.log(loglevel,message);
        }
    }
}
