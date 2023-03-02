import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
public class application {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter Something");
        String userEnter = sc.nextLine();
        if(!StringUtils.isNumeric(userEnter)){
            System.out.println("You Entered: \"" + userEnter + "\" is not a number");
        }
        System.out.printf("Flipped Case: %s", StringUtils.reverse(userEnter));
    }
}
