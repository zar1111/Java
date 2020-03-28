
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.Comparator;  
import java.util.List;  
import java.util.Map;  
import java.util.Map.Entry;  
import java.util.TreeMap;  

  
public class WordCount {  
  
    public static void main(String[] args) throws Exception {  
          
        BufferedReader br = new BufferedReader(new FileReader("text.txt"));  
        List<String> lists = new ArrayList<String>();  
        String readLine = null;
		while((readLine = br.readLine()) != null){  
            String[] wordsArr1 = readLine.split("[^a-zA-Z]");  
            for (String word : wordsArr1) {  
                if(word.length() != 0){  
                    lists.add(word);  
                }  
            }  
        }  
          
        br.close();  
          
        Map<String, Integer> wordsCount = new TreeMap<String,Integer>();       
          

        for (String li : lists) {  
            if(wordsCount.get(li) != null){  
                wordsCount.put(li,wordsCount.get(li) + 1);  
            }else{  
                wordsCount.put(li,1);  
            }  
  
        }  
          
        SortMap(wordsCount);  
      
    }  
      

    public static void SortMap(Map<String,Integer> oldmap){  
          
        ArrayList<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(oldmap.entrySet());  
          
        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){  
            @Override  
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {  
                return o2.getValue() - o1.getValue();  
            }  
        });  
          
        for(int i = 0; i<list.size(); i++){  
            System.out.println(list.get(i).getKey()+ ": " +list.get(i).getValue());  
        }     
    }  
  
} 
