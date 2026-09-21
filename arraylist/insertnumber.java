package arraylist;
import java.util.ArrayList;

public class insertnumber {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
     list.add(2,99);
        System.out.println(list);
    }   
}
