package greeting;
import java.util.*;
import java.util.PriorityQueue;
public class Greeting {

    public static void main(String[] args) {
         PriorityQueue<String> nicknames = new PriorityQueue<>();
         Scanner s = new Scanner(System.in);
         char Hi;
         System.out.println("Enter the nicknames of 4 of your classmates: ");
         for(int i=0; i<4; i++){
             String nickname = s.nextLine();
             nicknames.add(nickname);
         }
         System.out.print("Press H to say Hi to each of them. : ");
         while(true){
             Hi = s.nextLine().charAt(0);
             if(Hi == 'H'){
                 System.out.println("Hi " + nicknames.remove());
                 if(nicknames.isEmpty()){
                     System.out.println("Done saying Hi");
                     break;
                
       }                     
   
    }
         }
    }
}
