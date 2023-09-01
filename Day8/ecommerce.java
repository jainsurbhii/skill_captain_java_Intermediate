import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String email=sc.nextLine();
        String password=sc.nextLine();
        String address=sc.nextLine();
        input(name,email,password,address);
    }
    public static boolean isValidEmail(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        Matcher match =pat.matcher(email);
        return match.matches();

    }
    public static void input(String name,String email,String password,String address){

    }
}
class User{
    private String name;
    private String email;
    private String password;
    private String address;

    public User(String name, String email,String password,String address ){
        this.name=name;
        this.email=email;
        this.password=password;
        this.address=address;
    }

    public void setName(String name){
        this.name=name;
    }
    public  void setEmail(String email){
        this.email=email;
    }
    public  void setPassword(String password){
        this.password=password;
    }

    public  void setAddress(String address){
        this.address=address;
    }
}
class UserRepository{
    ArrayList<User> userList  = new ArrayList<>();

    void addUser(User user){
        userList.add(user);

    }
    void getUser(String email){

    }
    void getAllUsers(){

    }

}
