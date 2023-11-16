package programs;
import java.util.*;
public class Programs {
    
static Scanner s = new Scanner (System.in);
static HashMap<Integer,String>students = new HashMap<Integer,String>();

    public static void main(String[] args) {
        
    HashMap <String, String> course = new HashMap<String, String>();
    course.put("BSIT", " - Bachelor of  Science in Information Technology");
    course.put("BSCS", " - Bachelor of  Science in Computer Science");
    course.put("BSIS", " - Bachelor of  Science in Information Systems");
    
    for (Map.Entry<String, String> n : course.entrySet()) {
    System.out.println(n.getKey() + " " +n.getValue() + " ");  
		               
		          }  
		            
     System.out.println("Removed First Entry: " + course.remove("BSCS"));    
		            
     System.out.println(course.containsKey("BsCpE"));
    }
 }
    

