import java.util.Map;
import java.util.HashMap;

public class Admin {

    public ArrayBase arrayBase = ArrayBase.getInstance();
    public void checkOutAll(){

        System.out.println("\nameAgeBase:");
        for (Map.Entry<String, Integer> entry : arrayBase.ageNameBase.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();
            System.out.println("Name: " + name + ", Age: " + age);
        }
        System.out.println("\nloginPasswordBase:");
        for (Map.Entry<String, String> entry : arrayBase.loginPasswordBase.entrySet()) {
            String login = entry.getKey();
            String password = entry.getValue();
            System.out.println("Login: " + login + ", Password: " + password);
        }
    }
}
