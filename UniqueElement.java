



//find all unique elements in a list
import java.util.*;  
class UniqueElement{
 //count occurence of each number in list   
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter Size of list");
  int sz=sc.nextInt();
  System.out.println("enter elements of list");
 // List<Integer> list=new ArrayList<Integer>();
 HashMap<Integer,Integer>mp = new HashMap<>();
  for(int i=0;i<sz;i++){
   int num=sc.nextInt();
 //  list.add(num);
   if(mp.containsKey(num)){
    mp.replace(num,mp.get(num)+1);
   }else{
    mp.put(num,1);
   }
 }

 for (Map.Entry<Integer, Integer> e : mp.entrySet())
            if(e.getValue()==1){
              System.out.print(e.getKey()+" ");
             }
//   for(int num:list)  
  //  System.out.print(num+" ");     

}
}

