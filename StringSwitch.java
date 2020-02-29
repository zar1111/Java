//import sun.net.www.content.text.plain;

class StringSwitch{

    public static void main(String[] args){

        String command = "Cancel";
        switch(command){
            case "connect":
            System.out.println("Connecting");
            break;
            
            case "Cancel":
            System.out.println("Canceling..");
            break;
            
            default:
            break;
        }
        
    }

}
