import java.util.ArrayList;//import ArrayList
import java.util.List;//import ArrayList
import java.util.Scanner;/// Import the Scanner class to take input
import java.util.regex.Matcher;// Importing Matcher class from java.util.regex package
import java.util.regex.Pattern;// Importing Pattern class from java.util.regex package

public class Main {

    public static void main(String[] args) {
        UserRepository userRepository=new UserRepository();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        String name=sc.nextLine();
        System.out.println("Enter Email");
        String email=sc.nextLine();
        System.out.println("Enter password");
        String password=sc.nextLine();
        System.out.println("Enter Address");
        String address=sc.nextLine();
        sc.close();
        input(name,email,password,address);//function calling
    }
    //function to check input is valid or not
    public static void input(String name,String email,String password,String address){
        //check all fields
        if(name.isEmpty() ||email.isEmpty()||password.isEmpty()||address.isEmpty()){
            System.out.println("All field are mandatory");
        }
        //Check email is valid or not
        else if(!isValidEmail(email)){
            System.out.println("Please enter valid email");
        }
        else {
            User user=new User(name,email,password,address);
            UserRepository userRepository=new UserRepository();
            userRepository.addUser(user);
            UserRepository.getUser(email);
            UserRepository.getAllUsers();
        }
    }
    //function to check email format
    public static boolean isValidEmail(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        Matcher match =pat.matcher(email);
        return match.matches();

    }
}
//User input
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

    public String getName(){
        return name;
    }
    public  String getPassword(){
        return password;
    }
    public String getEmail(){
        return email;
    }
    public  String getAddress(){
        return address;
    }
}
//UserRepository
class UserRepository{

    private static List<User> userList;

    public UserRepository(){
        userList  = new ArrayList<>();
    }
//Add user in the list
    public void addUser(User user){
        userList.add(user);
    }
    //check email is present or not
    public static void getUser(String email){
        System.out.println("Enter Email to check");
        Scanner sc=new Scanner(System.in);
        email=sc.nextLine();
        for (User UserList : userList){
            if (UserList.getEmail().equalsIgnoreCase(email)){
                System.out.println("Email already exits");
            }
            else {
                System.out.println("Data Saved Successfully");
            }
        }
        sc.close();
    }
    //To get all the data
    public static void getAllUsers(){
        for (User  UserList: userList) {
            System.out.println(UserList.getAddress());
            System.out.println(UserList.getEmail());
            System.out.println(UserList.getName());
            System.out.println(UserList.getPassword());
        }
    }
}
