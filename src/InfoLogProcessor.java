public class InfoLogProcessor extends LogProcessor{
    InfoLogProcessor (LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    public void processLog(int loglevel,String message) {
        if(loglevel==INFO){
            System.out.println("Info: "+message);
        }else{
            super.log(loglevel,message);
        }
    }
}
