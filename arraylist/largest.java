package arraylist;
import java.util.ArrayList;

public class largest {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        int largest = list.get(0);
        for(int i =1; i<list.size();i++){
            if(largest<list.get(i))
                largest = list.get(i);
        }
        System.out.println(largest);
    }
    
}
