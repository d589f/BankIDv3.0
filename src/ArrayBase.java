import java.util.ArrayList;
import java.util.HashMap;

public class ArrayBase {
    private static ArrayBase INSTANCE;
    public HashMap <String, Integer> ageNameBase;
    public HashMap <String, String> loginPasswordBase;

    public ArrayBase() {
        ageNameBase = new HashMap<>();
        loginPasswordBase = new HashMap<>();
    }

    public static ArrayBase getInstance() {
        if (INSTANCE == null) {
            synchronized (ArrayBase.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ArrayBase();
                }
            }
        }
        return INSTANCE;
    }

    public ArrayBase getBaseInstance() {
        return ArrayBase.getInstance();
    }


}