// package demo;
// import java.io.File;
// import java.util.Scanner;
// import java.io.FileNotFoundException;
// import java.util.HashMap;
// import java.util.Iterator;
// import java.util.Set;
// public class Jiake {
//     public static <type> void main (String[] args) throws FileNotFoundException {
//         File file=new File("Test.txt");                  //读取文件
//         if(!file.exists()){
//             System.out.println("file doesn't exist");
//             return;
//         }  
//         Scanner scanner=new Scanner(file);
//         HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
//         System.out.println("-----------------------------------");
//         while(scanner.hasNextLine()) {
//             String line=scanner.nextLine();
//             // if (line=="")
//             // {
//             //     continue;
//             // }
//             //System.out.println(line);
//             String[] lineWords=line.split("\\W+" );          //导入文章，但是被注释掉了
//             // for(int i=0;i<lineWords.length;i++) {
//             //     if(lineWords[i] == "\f"){
//             //         i--;
//             //     }
//             // }

//             lineWords[i] = lineWords[i].toLowerCase();
//             System.out.print(lineWords[i] + " | ");
//             }
//             Set<String> wordSet=hashMap.keySet();
//             for(int i=0;i<lineWords.length;i++) {
//                 if(wordSet.contains(lineWords[i])) {
//                     Integer number=hashMap.get(lineWords[i]);
//                     number++;
//                     hashMap.put(lineWords[i], number); 
//                     }
//                 else {
//                     hashMap.put(lineWords[i], 1);
//                 }
//             }
//         }
//         System.out.println("------------------------------");
//         Iterator<String> iterator=hashMap.keySet().iterator();
//         int max=0;
//         int ot = 0;
//         int count = 0;
//         //String[] onetimeString = new String[lineWords.length];
//         String minword=null;
//         String maxword=null;
//         while(iterator.hasNext()){
//             String word=iterator.next();
//             //System.out.printf("%-12s %d\n",word,hashMap.get(word));
//             if(hashMap.get(word)>max) {                         
//                 max=hashMap.get(word);
//                 maxword=word;
//             }
//             if(hashMap.get(word) == 1) {                         
                
//                 // onetimeString[count]=word;
//                 // ot++;
//                 // count++;
//                 System.out.print(word+ " ");
//             }
//             // if(hashMap.get(word)<min) {                          
//             //     min=hashMap.get(word);
//             //     minword=word;
//             // }
//         } 
//         System.out.println(); 
//         System.out.print("\""+maxword+"\""+" is the most frequent word, appeared ");
//         System.out.println(""+max+" times");
//         // for (int i = 0; i<=ot; i++){
//         //     System.out.println(onetimeString[i]);
//         // }
//         // System.out.println(maxword);
//         // System.out.println(""+max+"");
//         // System.out.println(""+minword);
//         // System.out.println(" "+min+"");
        
        
//     }
// }
package demo;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class Jiake {
    public static <type> void main (String[] args) throws FileNotFoundException {
        File file=new File("Test.txt");                  //读取文件
        if(!file.exists()){
            System.out.println("file doesn't exist");
            return;
        }  
        Scanner scanner=new Scanner(file);
        HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
        System.out.println("-----------------------------------");
        while(scanner.hasNext()) {
            String line=scanner.next();
            //scanner.nextline();
            // while(line=="\r"){
            //     System.out.println("-----------------------------------");
        
            //     line=scanner.next();
            //     continue;
            // }
            //System.out.print(line);
            String[] lineWords=line.split("\\W+");          //导入文章，但是被注释掉了
            
            for(int i=0;i<lineWords.length;i++) {
            lineWords[i] = lineWords[i].toLowerCase();
            System.out.print(lineWords[i] + " | ");
            }
            Set<String> wordSet=hashMap.keySet();
            for(int i=0;i<lineWords.length;i++) {
                if(wordSet.contains(lineWords[i])) {
                    Integer number=hashMap.get(lineWords[i]);
                    number++;
                    hashMap.put(lineWords[i], number); 
                    }
                else {
                    hashMap.put(lineWords[i], 1);
                }
            }
        }
        System.out.println("------------------------------");
        Iterator<String> iterator=hashMap.keySet().iterator();
        int max=0;
        int ot = 0;
        int count = 0;
        //String[] onetimeString = new String[lineWords.length];
        String minword=null;
        String maxword=null;
        while(iterator.hasNext()){
            String word=iterator.next();
            //System.out.printf("%-12s %d\n",word,hashMap.get(word));
            if(hashMap.get(word)>max) {                         
                max=hashMap.get(word);
                maxword=word;
            }
            if(hashMap.get(word) == 1) {                         
                
                // onetimeString[count]=word;
                // ot++;
                // count++;
                System.out.print(word+ " ");
            }
            // if(hashMap.get(word)<min) {                          
            //     min=hashMap.get(word);
            //     minword=word;
            // }
        } 
        System.out.println(); 
        System.out.print("\""+maxword+"\""+" is the most frequent word, appeared ");
        System.out.println(""+max+" times");
        // for (int i = 0; i<=ot; i++){
        //     System.out.println(onetimeString[i]);
        // }
        // System.out.println(maxword);
        // System.out.println(""+max+"");
        // System.out.println(""+minword);
        // System.out.println(" "+min+"");
        
        
    }
}