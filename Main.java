
public class Main {
    public static void main(String[] args){
        String name = "banana";
       int count =0;
       for(int i =0; i<name.length(); i++){
           if(name.charAt(i)=='a'){
               count++;
           }
       }
       System.out.println("Number of 'a' in the string: " + count);
    }
}