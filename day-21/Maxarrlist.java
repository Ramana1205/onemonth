import java.util.*;

public class Maxarrlist {
    public static void max(ArrayList<Integer> list){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max=Math.max(max,list.get(i));
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        max(list);
        
    }
    
}
