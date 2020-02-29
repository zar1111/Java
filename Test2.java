package nameyu;
import java.util.Scanner;
public class Test2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double wide=(Math.random()*101+(-50));
        
        
        //int 改成double之后，（50，51）和（-51，-50）这两个不符合题意的取值范围内的数字就有可能出现，
        
        double high=(Math.random()*201+(-100));
        
        
        //所以我加了个while来规避两种情况
        while (wide>50|wide<(-50)|high>100|high<(-100)){
            wide=(Math.random()*101+(-50));
            high=(Math.random()*201+(-100));
        }

        Scanner input=new Scanner(System.in);
        System.out.println("The coordinate is " + "(" +   wide + "," + high + ")"); 
        
    }
    }   
