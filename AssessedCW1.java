 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

                                 
public class AssessedCW1 {
    public static void main(String args[]) throws IOException     
    {
        System.out.println();
        File file = new File("Test.txt");
        if(!file.exists()) {  
            System.out.println("File doesn't even exist, sorry I can't analyse it. Please check the file name.");
            System.exit(0);  
        }
        if(file.length() == 0) {  
                System.out.println("The text file is empty, sorry I can't analyse it. Please add something to it.");
                System.exit(0);  
        }
        Word word=new Word();                                      
        Word chainNode,newNode;                                             
        String str="";
        
        FileReader precheck =new FileReader("Test.txt");
        FileReader formalread =new FileReader("Test.txt");  
        char[] c = new char[1];                                

        boolean exist=false; 

        while((precheck.read(c))!=-1){

            String specialstr = "`~@#$%^&*_=+{}[]|\\:;\"<>";
            
 
            boolean status = specialstr.contains(String.valueOf(c));
 
            if(status){
                System.out.println("This text may contain special characters, are you sure you want to continue? yes/no");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String answer;
                answer = br.readLine();
                if(answer.equals("yes")){
                    System.exit(0);
                }
                System.out.println();
            break;
            }
        }
        precheck.close();

        while((formalread.read(c))!=-1)                            
        {
            //System.out.print(String.valueOf(c));
         
            if(String.valueOf(c).equals("\r")||String.valueOf(c).equals("\n")||String.valueOf(c).equals(" ")||String.valueOf(c).equals(",")||String.valueOf(c).equals(".")||String.valueOf(c).equals("\"")||String.valueOf(c).equals("'"))
            {
                chainNode = word;
                while(chainNode != null)            
                {
                    if(chainNode.value.equalsIgnoreCase(str))          
                    {
                        chainNode.times++;
                        exist=true;
                        break;
                    }
                    else
                    {
                        chainNode=chainNode.next;
                    }
                }
                if(exist==false)                       
                {
                    newNode=new Word(str,1);
                    newNode.next=word.next;
                    word.next=newNode;
                    str="";
                }
                else
                {
                    exist=false;
                    str="";
                }
            }
            else                                     
            {
                str+=String.valueOf(c);
            }
        }
        formalread.close();

        if (str!=""){            
            chainNode=word;
            while(chainNode!=null)            
            {
                if(chainNode.value.equalsIgnoreCase(str))          
                {
                    chainNode.times++;exist=true;break;
                }
                else
                {
                    chainNode=chainNode.next;
                }
            }
            if(exist==false)                       
            {
                newNode=new Word(str,1);
                newNode.next=word.next;
                word.next=newNode;
                str="";
            }
            else
            {
                exist=false;
                str="";
            }
        }
      
        //int i = 1;
        newNode=new Word("",0);
        chainNode=word.next;
        
        while(chainNode!=null)
        {
            if(chainNode.times>=newNode.times)
            {
                newNode=chainNode;
            }
            chainNode=chainNode.next;
        }    
        newNode.value = newNode.value.toLowerCase();
        System.out.println("The most frequent word is \""+newNode.value+"\", appeared "+newNode.times+" times.");
        System.out.println();
        
        chainNode = word;
        Boolean oexist = false;
        
        while(chainNode!=null)
        {
            
            if(chainNode.times==1)
            {
                oexist = true;
            }
            chainNode=chainNode.next;
        }
        if(oexist == false){
            System.out.println("There is no word appears only once.");
            System.exit(0);
        }

        chainNode=word;
        System.out.print("Those words appeared only one time: ");
        while(chainNode!=null)
        {
            
            if(chainNode.times==1)
            {
                chainNode.value = chainNode.value.toLowerCase();
                System.out.print("\""+ chainNode.value+"\"");
            }
            chainNode=chainNode.next;
        }
        System.out.print(".");    
        
        System.out.println();
 
    }
}

class Word                                      
{
    String value;                                  
    int times;                                     
    Word next;                                    
    public Word(String value,int times)           
    {
        this.value=value;
        this.times=times;
        next=null;
    }
    public Word()                          //polymorphism       
    {
        this.value="";
        this.times=0;
        next=null;
    }
}   
abstract class Prompt {  
    abstract void promp();  
}  
  
class Prompt0 extends Prompt {  
    public void promp() {  
        System.out.println("There is no word appears only once.");  
    }  
   
}  
  
class Prompt1 extends Prompt {  
    public void promp() {  
        System.out.print("Those words appeared only one time: ");  
    }  
    
}    

