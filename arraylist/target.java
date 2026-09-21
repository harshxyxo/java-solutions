package arraylist;
import java.util.ArrayList;

public class target {
    public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        int target = 30;
        int index =-1;
        for(int i=0; i<list.size();i++){
            if(list.get(i) == target){
                System.out.println(i);
                break;
            }
        }
    }        
}
