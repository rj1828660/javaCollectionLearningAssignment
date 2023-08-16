//find all next greater element of all no in a list.

import java.util.*;
 class NextGreater {
    public static void main(String[] args) {




                Scanner sc=new Scanner(System.in);
                System.out.println("enter Size of list");
                int sz=sc.nextInt();
                System.out.println("enter elements of list");
                 List<Integer> list=new ArrayList<Integer>();
//                HashMap<Integer,Integer>mp = new HashMap<>();
                for(int i=0;i<sz;i++){
                    int num=sc.nextInt();
                      list.add(num);
                }
                Stack<Integer>st=new Stack<>();
                boolean first=true;
                for(int num: list ){
                    if(first){
                        st.push(num);
                        first=false;
                    }else{
                        while(st.size()>0&&st.peek()<num){
                            System.out.print(st.peek()+"-->"+num+"    ");
                            st.pop();
                        }
                        st.push(num);
                    }

                }
                




            }
        }            
