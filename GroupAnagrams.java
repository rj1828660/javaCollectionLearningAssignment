import java.util.*;
import java.io.*;

class  GroupAnagrams{


    public static void main(String[] args)
    {
        String wordArr[]
                = { "cat", "dog", "tac", "god", "act" };
        Map<String, List<String>> mp = new HashMap<String, List<String>>();

        for(String str:wordArr){
            char tempArray[] = str.toCharArray();


            Arrays.sort(tempArray);
            String temp= String(tempArray);
            if(mp.containsKey(temp)){
                mp.get(temp).add(str);
            }else{
                List<String>lst=new ArrayList<>();
                lst.add(str);
                mp.put(temp,lst);
            }


        }

        for(Map.Entry<String, List<String>> entry : mp.entrySet()){
            
            for(String s : entry.getValue())
            {
                System.out.println(s);
            }
        }
    }
}

