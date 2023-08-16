import java.util.*;  
import javafx.util.Pair;
class TopKfrequent{
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
 // list.add(num);
   if(mp.containsKey(num)){
    mp.replace(num,mp.get(num)+1);
   }else{
    mp.put(num,1);
   }
 }
    List<Pair<Integer, Integer>> list_pair = new ArrayList<Pair<Integer, Integer>>();

 for (Map.Entry<Integer, Integer> e : mp.entrySet())
     list_pair.add(new Pair<Integer, Integer>(e.getKey(),e.getValue()));

    list_pair.sort(new Comparator<Pair<Integer, Integer>>() {
        @Override
        public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
            if (o1.getValue() > o2.getValue()) {
                return -1;
            } else if (o1.getValue().equals(o2.getValue())) {
                return 0; // You can change this to make it then look at the
                //words alphabetical order
            } else {
                return 1;
            }
        }
    });
    System.out.print("Enter value of k :");
    int k=sc.nextInt();
    for (Pair<Integer, Integer> temp : list_pair){
        System.out.print(temp.getKey()+"  ");
        k--;
        if(k==0)break;
    }


}
}

