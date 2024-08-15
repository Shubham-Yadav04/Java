
import java.util.*;
public class CollectionsPractice {


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

   while(it.hasNext()){
       int value=it.next();
//       if(value%2==0) {
//           it.remove();
//       }
//       else{}
       System.out.println(value);
   }

    }
}
