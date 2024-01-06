package runblooddata;
import java.util.Scanner;
public class RunBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Blood Type of Patient(O, A, B, AB): ");
        String bloodtype1 = scanner.nextLine();
        
        System.out.println("Enter The Rhesus Factor (+ or -): ");
        String bloodtype2 = scanner.nextLine();

        BloodData bloodtype;
        if (bloodtype1.isEmpty() || bloodtype2.isEmpty()) {
            bloodtype = new BloodData();
        } else {
            bloodtype = new BloodData(bloodtype1, bloodtype2);
        }

        bloodtype.display();
    }
}
