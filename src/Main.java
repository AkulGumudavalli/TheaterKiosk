import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 0;
        // num age = 0
        //Output "What is your age"
        System.out.println("What is your age?");
        //Input age
        if (input.hasNextInt()){
            int age = input.nextInt();
        //if age > 20 then 
            if(age > 20){
                //Output you get a wristband
                System.out.println("You get a wristband");
            }
        //end if 
        }   
    }
}
