package arraylist;
import java.util.ArrayList;

public class counteven {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        int count =0;
        for(int i=0; i<list.size();i++){
            if(list.get(i)%2 ==0)
                count++;
        }
        System.out.println(count);
    }
    
}
