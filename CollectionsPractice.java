
import java.util.*;
public class CollectionsPractice {

//    variabele argument concepts practice (varibale ARGS....)
    public static int addMyNumbers(int x,int y, int ...args){
        int sum=x+y;
        for(int i=0;i< args.length;i++){
            sum=sum+args[i];
        }
        return sum;
    }


    public static void main(String []args){
        List <Integer> Name= new ArrayList<Integer>();
        Name.add(5);
        Name.add(345);
        Name.add(45);
        Name.add(56);

        Set<Integer> Aset=new HashSet<>(Name);
        Integer arr[]={2,3,4,5,56,3,4};
        LinkedList<Integer> Link= new LinkedList<>();

//        Name.remove(1);
        Iterator<Integer> it= Aset.iterator();

//   while(it.hasNext()){
//       int value=it.next();
//       if(value%2==0) {
//           it.remove();
//       }
//       else{}
//       System.out.println(value);
//   }

//        System.out.println(addMyNumbers(2,3,4,5,6,67,7));
    }
}
