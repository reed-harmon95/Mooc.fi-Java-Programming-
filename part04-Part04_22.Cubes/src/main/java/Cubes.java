
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cube = 0, num; 
        String line;
        
        
        while (true) {
            line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }
            num = Integer.valueOf(line);
            cube = num * num * num;
            System.out.println(cube);
        }

    }
    
}
