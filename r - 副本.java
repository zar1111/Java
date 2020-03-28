import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

                                 
public class r {
    public static void main(String args[]) throws IOException     
    {
        Word word=new Word();                                      
        Word Node,newNode;                                             
        String str="";
        FileReader f =new FileReader("text.txt");                
        char[] c=new char[1];                                
        int b=0;
        boolean exist=false;                             
        while((b=f.read(c))!=-1)                            
        {
         
            if(String.valueOf(c).equals("\r")||String.valueOf(c).equals("\n")||String.valueOf(c).equals(" ")||String.valueOf(c).equals(",")||String.valueOf(c).equals(".")||String.valueOf(c).equals("\"")||String.valueOf(c).equals("'"))
            {
                Node=word;
                while(Node!=null)            
                {
                    if(Node.value.equalsIgnoreCase(str))          
                    {
                        Node.geshu++;exist=true;break;
                    }
                    else
                    {
                        Node=Node.next;
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
        if (str!=""){
            Node=word;
                while(Node!=null)            
                {
                    if(Node.value.equalsIgnoreCase(str))          
                    {
                        Node.geshu++;exist=true;break;
                    }
                    else
                    {
                        Node=Node.next;
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
      
        for(int i=1;i<=1;i++)                   
        {
            newNode=new Word("",0);
            Node=word;
            
            while(Node!=null)
            {
                if(Node.geshu>=newNode.geshu)
                {
                    newNode=Node;
                }
                Node=Node.next;
            }
          
            System.out.println(newNode.value+" "+newNode.geshu);
            // Node=word;
            // while(Node!=null)
            // {
            //     if(Node.geshu>newNode.geshu)
            //     {
            //         newNode=Node;
            //     }
            //     Node=Node.next;
            // }
           
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