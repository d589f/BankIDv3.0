import java.util.Scanner;

public class Registration {
    public Scanner scanner = new Scanner(System.in);
    public void FirstPartReg(){
        System.out.print("Do you have an account?: (yes/no)   ");
        String answer = scanner.nextLine();
        if(answer.equalsIgnoreCase("yes")){
            IfAnswerYes();
        }else if(answer.equalsIgnoreCase("no")){

            IfAnswerNo();
        }
    }

    public void IfAnswerYes(){
        Login login = new Login();
        login.StartLogin();

    }

    public void IfAnswerNo(){

        Base base = Base.getInstanceData();
        ArrayBase arrayBase = ArrayBase.getInstance();


        System.out.print("What's your name?   ");
        base.userName = scanner.nextLine();


        System.out.print("How old are you?   ");
        base.age = scanner.nextInt();
        scanner.nextLine();

        arrayBase.ageNameBase.put(base.userName, base.age);

        System.out.print("Enter new login:   ");
        base.login = scanner.nextLine();


        System.out.print("Enter new password:   ");
        base.password = scanner.nextLine();

        arrayBase.loginPasswordBase.put(base.login, base.password);



        System.out.print("Want to log in now?: (yes/no)   ");
        if(scanner.nextLine().equalsIgnoreCase("yes")){
            IfAnswerYes();
        }else{
            System.out.print("Closing.. ");
            IfAnswerNo();
        }
    }

}
