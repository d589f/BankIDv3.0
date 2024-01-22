import lombok.Data;

@Data
public class Base {
    public String userName;
    public int age;
    public String login;
    public String password;


    private static Base INSTANCE;

    private Base() {

    }

    public static Base getInstanceData() {
        if (INSTANCE == null) {
            synchronized (Base.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Base();
                }
            }
        }
        return INSTANCE;
    }

    public Base getBaseInstance() {
        return Base.getInstanceData();
    }

    public void checkOutNameAgeBase() {
        Base base = Base.getInstanceData();
    }
}
