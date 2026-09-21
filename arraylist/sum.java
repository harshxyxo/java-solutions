package arraylist;

import java.util.ArrayList;

public class sum {
     public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        int total=0;
        for(int i=0; i<list.size();i++){
            total += list.get(i);
        }
        System.out.println(total);
       }
    
}
