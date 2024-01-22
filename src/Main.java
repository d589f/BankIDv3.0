import java.util.Scanner;

public class Main {

    public Base base = Base.getInstanceData();
    public ArrayBase arrayBase = ArrayBase.getInstance();

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.print("Do you have an account? (yes/no)    ");
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("yes")){
            Login login = new Login();
            login.StartLogin();
        }else if(answer.equalsIgnoreCase("no")){
            Registration registration = new Registration();
            registration.IfAnswerNo();
        }

    }

}
