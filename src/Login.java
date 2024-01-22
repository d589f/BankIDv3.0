import java.util.Scanner;

public class Login {

    public Scanner scanner = new Scanner(System.in);
    public Base base = Base.getInstanceData();
    public ArrayBase arrayBase = ArrayBase.getInstance();

    public void StartLogin(){
        try{
            ArrayBase arrayBase1 = ArrayBase.getInstance();

            System.out.print("Enter your login:   ");
            String login = scanner.nextLine();


            if(login.equalsIgnoreCase("admin")){
                System.out.print("Enter password:   ");
                int adminPassword = scanner.nextInt();
                if(adminPassword == 1556 ){
                    Admin admin = new Admin();
                    admin.checkOutAll();
                }
            }

            boolean containsLogin = arrayBase.loginPasswordBase.containsKey(login);
            if(containsLogin){
                System.out.print("Enter your password:   ");
                String password = scanner.nextLine();
                if (arrayBase.loginPasswordBase.containsKey(login) && arrayBase.loginPasswordBase.get(login).equals(password)) {
                    System.out.println("Welcome, " + login + "!");
                } else {
                    System.out.println("Login or password is incorrect.");
                }
            }

        }catch (Exception e){
            System.out.println("Wrong login or password" );
        }

    }
}
