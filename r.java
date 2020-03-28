import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

                                 
public class r {
    public static void main(String args[]) throws IOException     
    {
        Word word=new Word();                                      
        Word lian,xin;                                             
        String str="";
        FileReader f =new FileReader("text.txt");                
        char[] c=new char[1];                                
        int b=0;
        boolean exist=false;                             
        while((b=f.read(c))!=-1)                            
        {
         
            if(String.valueOf(c).equals("\r")||String.valueOf(c).equals("\n")||String.valueOf(c).equals(" ")||String.valueOf(c).equals(",")||String.valueOf(c).equals(".")||String.valueOf(c).equals("\"")||String.valueOf(c).equals("'"))
            {
                lian=word;
                while(lian!=null)            
                {
                    if(lian.value.equalsIgnoreCase(str))          
                    {
                        lian.geshu++;exist=true;break;
                    }
                    else
                    {
                        lian=lian.next;
                    }
                }
                if(exist==false)                       
                {
                    xin=new Word(str,1);
                    xin.next=word.next;
                    word.next=xin;
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
      
        for(int i=1;i<=10;i++)                   
        {
            xin=new Word("",0);
            lian=word.next;
            
            while(lian!=null)
            {
                if(lian.geshu>xin.geshu)
                {
                    xin=lian;
                }
                lian=lian.next;
            }
          
            System.out.println("the "+i+"th "+xin.value+" Number "+xin.geshu);
            lian=word;
           
            while(lian.next!=null)
            {
                if(lian.next.value.equalsIgnoreCase(xin.value))
                {
                    lian.next=lian.next.next;
                    break;
                }
                lian=lian.next;
            }
        }
    }
}
class Word                                      
{
    String value;                                  
    int geshu;                                     
    Word next;                                    
    public Word(String value,int geshu)           
    {
        this.value=value;
        this.geshu=geshu;
        next=null;
    }
    public Word()                                 
    {
        this.value="";
        this.geshu=0;
        next=null;
    }
}       
//https://www.cnblogs.com/lizhiyan-world/p/3574414.html