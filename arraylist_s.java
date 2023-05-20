import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class arraylist_s {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ar = new ArrayList<>();
        ArrayList<String> ne = new ArrayList<>();
        
        ar.add("0th index");
        ar.add("1st index");
        ar.add("2nd index");
        ar.add("3rd index");
        ar.set(0,"changed the oth index");

        // ar.add(sc.nextLine());

        int size = ar.size();
        
        
        System.out.println("size: " + size);

        for(int i=0;i<size;i++)
        {
            System.out.println(ar.get(i)+" index");
        }

        ne.add("ab");
        ne.add("copy");
        ne.add("ho");
        ne.add("gaya");


        // removing by valye
        // Integer.valueOf(num);
    ne.remove(String.valueOf("ab"));
    ne.remove(String.valueOf("gaya"));
       
        //removing by index
        ne.remove(1);
        ne.addAll(ar);
    
        
        size = ne.size();

        for(int i=0;i<size;i++)
        {
            System.out.println(ne.get(i));
        }
        
        
        
        System.out.println("before: \n");
        System.out.println(ar+"\n");

        ar.clear(); // 
        
        System.out.println("after: \n");
        System.out.println(ar+"\n");
        
        
        
        
        System.out.println(ne.contains("copy"));//




        
        for(String ele:ne)
        {
            System.out.println(ele);
        }

        Iterator<String> it = ne.iterator();
        while(it.hasNext())
        {
            System.out.println("iterator: "+it.next());
        }
    }
}
